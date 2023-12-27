package org.example.design_patterns.structural.decorator.decorators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import lombok.AllArgsConstructor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 26, 2023
 * @see <a href="https://refactoring.guru/design-patterns/decorator">https://refactoring.guru/design-patterns/decorator</a>
 * @since 17
 */
@AllArgsConstructor
public class FileDataSource implements IDataSource {

    private String name;

    @Override
    public void writeData(String data) {
        File file = new File(name);

        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);

        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        return new String(buffer);
    }
}