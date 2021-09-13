package ua.com.foxminded.calculator;

import java.util.Formatter;

public class  Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();  // main computing class
        Result result = calculator.divide(78945, 4);
        Formatter formatter = FormatterFactory.getInstance().get("classic"); // Formatter is an interface
        Formatter output = formatter.format(String.valueOf(result)); // formatted result
        System.out.println(output);
    }
}
