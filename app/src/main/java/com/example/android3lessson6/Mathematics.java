package com.example.android3lessson6;

public class Mathematics {
    public String add(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "An error occured. You have tried to save ";
        }
        return String.valueOf(num1 + num2);
    }

    public String divide(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num1 < 0 || num2 < 0) {
            return "An error occured. You have tried to divie by zero ";
        }
        return String.valueOf(num1 / num2);
    }
}
