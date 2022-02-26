package com.example.android3lessson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public String add(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "An error occured. You have tried to save ";
        }
        return String.valueOf(num1 + num2);
    }

    public String subtract(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "An error occured. You have tried to divie by zero ";
        }
        return String.valueOf(num1 - num2);

    }

    public String divide(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());

        return String.valueOf(num1 / num2);
    }

    public String multiply(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 * num2);

    }

    public String dividedByZero(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            System.out.println("An error occurred. You have tried to divide by zero ");
        }
        return String.valueOf(0);

    }

    public String includingMinus(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 + num2);

    }

    public String areSymbolsIncluded(String a, String b) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p.matcher(a);
        Matcher m2 = p.matcher(b);
        boolean c = m1.find();
        boolean d = m2.find();

        if (c) {
            System.out.println("In String 1 there are special characters");
        } else if (d) {
            System.out.println("In String 2 there are special characters");
        } else {
            System.out.println("there is no special characters in these strings");
        }
        return a + b;
    }


}


