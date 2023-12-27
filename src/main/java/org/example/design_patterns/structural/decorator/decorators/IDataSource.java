package org.example.design_patterns.structural.decorator.decorators;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 26, 2023
 * @see <a href="https://refactoring.guru/design-patterns/decorator">https://refactoring.guru/design-patterns/decorator</a>
 * @since 17
 */
public interface IDataSource {

    void writeData(String data);

    String readData();
}