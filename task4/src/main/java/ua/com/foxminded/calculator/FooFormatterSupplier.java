package ua.com.foxminded.calculator;

public class FooFormatterSupplier implements FormatterSupplier {
    @Override
    public String name() {
        return "foo";
    }

    @Override
    public FooFormatter get() {
        return new FooFormatter();
    }

}
