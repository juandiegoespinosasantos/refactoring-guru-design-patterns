package org.example.design_patterns.structural.decorator.decorators;

import lombok.AllArgsConstructor;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 26, 2023
 * @see <a href="https://refactoring.guru/design-patterns/decorator">https://refactoring.guru/design-patterns/decorator</a>
 * @since 17
 */
@AllArgsConstructor
public class DataSourceDecorator implements IDataSource {

    private IDataSource wrappee;

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
