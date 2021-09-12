package ua.com.foxminded.calculator;

import java.util.function.Supplier;

public interface FormatterSupplier extends Supplier<Formatter> {
    String name();
}
