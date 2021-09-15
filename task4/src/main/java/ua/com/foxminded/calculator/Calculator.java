package ua.com.foxminded.calculator;

public class Calculator {
    public Result divide(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;
        return new Result(dividend, divisor, quotient, reminder);
    }
}
