package org.example.design_patterns.structural.decorator.decorators;

import java.util.Base64;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 26, 2023
 * @see <a href="https://refactoring.guru/design-patterns/decorator">https://refactoring.guru/design-patterns/decorator</a>
 * @since 17
 */
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(IDataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();

        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }

        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);

        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }

        return new String(result);
    }
}