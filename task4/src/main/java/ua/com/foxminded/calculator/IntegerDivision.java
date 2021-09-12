package ua.com.foxminded.calculator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class IntegerDivision {

    private int dividend;
    private int divisor;

    public void printLongDivision(int dividend, int divisor) {
        requirePositiveNumber(dividend);
        requirePositiveNumber(divisor);
        requireDividendBiggerThanDivisor(dividend, divisor);

        this.dividend = dividend;
        this.divisor = divisor;

        List<Integer> separatedDigits = separateDividend(dividend);

        List<String> listToPrint = prepareListToPrint(separatedDigits);

        printResult(listToPrint);
    }

    public List<String> prepareListToPrint(List<Integer> separatedDigits) {
        List<String> listToPrint = new LinkedList<>();

        int beginIndex = 0;
        int endIndex = 0;
        int partOfDividend = 0;

        while (beginIndex <= endIndex && endIndex < separatedDigits.size()) {
            if (beginIndex == endIndex) {
                partOfDividend = separatedDigits.get(beginIndex);
            } else {
                partOfDividend = Integer.parseInt(partOfDividend + "" + separatedDigits.get(endIndex));
            }
            if (partOfDividend < divisor) {
                endIndex++;
            } else {
                listToPrint.add(String.valueOf(partOfDividend));
                listToPrint.add(String.valueOf(partOfDividend - (partOfDividend % divisor)));
                if (partOfDividend % divisor > 0) {
                    separatedDigits.set(endIndex, partOfDividend % divisor);
                    } else {
                    endIndex++;
                }
                beginIndex = endIndex;
            }
        }
        listToPrint.set(0, String.valueOf(dividend));

        return listToPrint;
    }

    private void printResult(List<String> listToPrint) {
        List<String> result = new LinkedList<>();

        int lengthDividend = listToPrint.get(0).length();
        int lengthSubtractedNumber = listToPrint.get(1).length();

        String row1 = "_" + dividend + "|" + divisor;
        String row2 = ' ' + listToPrint.get(1) + spaces(lengthDividend - lengthSubtractedNumber)
                + '|' + hyphens(lengthDividend);
        String row3 = ' ' + hyphens(lengthSubtractedNumber) + spaces(lengthDividend - lengthSubtractedNumber)
                + '|' + (dividend / divisor);

        result.add(row1);
        result.add(row2);
        result.add(row3);

        String secondRowToNumber = ' ' + listToPrint.get(1);
        int lengthIndents = secondRowToNumber.length();

        for (int i = 2; i < listToPrint.size() - 1; i++) {
            int lengthUpperNumber = listToPrint.get(i).length();
            int lengthLowerNumber = listToPrint.get(i + 1).length();

            String upperRow = spaces(lengthIndents - lengthUpperNumber) + '_' + listToPrint.get(i);
            lengthIndents = upperRow.length();
            String lowerRow = spaces(lengthIndents - lengthLowerNumber) + listToPrint.get(i + 1);
            lengthIndents = lowerRow.length();
            String dividingRow = spaces(lengthIndents - lengthLowerNumber) + hyphens(lengthLowerNumber);

            result.add(upperRow);
            result.add(lowerRow);
            result.add(dividingRow);

            i += 2;
        }

        int lengthRemainder = String.valueOf(dividend / divisor).length() - 1;
        String endRow = spaces(lengthDividend - lengthRemainder) + (dividend % divisor);
        result.add(endRow);

        for (String s : result) {
            System.out.println(s);
        }
    }
    private List<Integer> separateDividend(int input) {
        List<Integer> separatedDigits = new LinkedList<>();

        while (input > 0) {
            separatedDigits.add(input % 10);
            input /= 10;
        }

        Collections.reverse(separatedDigits);

        return separatedDigits;
    }

    private String spaces(int length) {
        String spaces = "";

        for (int i = 0; i < length; i++) {
            spaces = spaces.concat(" ");
        }
        return spaces;
    }

    private String hyphens(int length) {
        String hyphens = "";

        for (int i = 0; i < length; i++) {
            hyphens = hyphens.concat("-");
        }
        return hyphens;
    }

    private void requirePositiveNumber(int input) {
        if (input < 1) {
            throw new IllegalArgumentException("Input number must be more than 0");
        }
    }

    private void requireDividendBiggerThanDivisor(int dividend, int divisor) {
        if (dividend < divisor) {
           throw new IllegalArgumentException("Dividend must be higher than divisor");
        }
    }
}
