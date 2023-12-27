package org.example.design_patterns.structural.decorator;

import org.example.design_patterns.structural.decorator.decorators.CompressionDecorator;
import org.example.design_patterns.structural.decorator.decorators.DataSourceDecorator;
import org.example.design_patterns.structural.decorator.decorators.EncryptionDecorator;
import org.example.design_patterns.structural.decorator.decorators.FileDataSource;
import org.example.design_patterns.structural.decorator.decorators.IDataSource;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 26, 2023
 * @see <a href="https://refactoring.guru/design-patterns/decorator">https://refactoring.guru/design-patterns/decorator</a>
 * @since 17
 */
public class DecoratorDemo {

    private static final String DEMO_FILE_PATH = "/tmp/OutputDemo.txt";

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(DEMO_FILE_PATH)));
        encoded.writeData(salaryRecords);

        IDataSource plain = new FileDataSource(DEMO_FILE_PATH);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}