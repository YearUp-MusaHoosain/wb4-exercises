package com.pluralsight;

public class NameFormatter {

    public static String prefix = "";
    public static String firstName = "";
    public static String middleName = "";
    public static String lastName = "";
    public static String suffix = "";

    private NameFormatter(){}

    public static String format(String firstName, String lastName){
        NameFormatter.firstName = firstName;
        NameFormatter.lastName = lastName;
        return NameFormatter.lastName + ", " + NameFormatter.firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        NameFormatter.firstName = firstName;
        NameFormatter.middleName = middleName;
        NameFormatter.lastName = lastName;
        NameFormatter.suffix = suffix;
        return NameFormatter.lastName + ", " + NameFormatter.firstName + " " + NameFormatter.middleName + ", " + NameFormatter.suffix;
    }

    public static String format(String fullName){
        NameFormatter.prefix = prefix;
        NameFormatter.firstName = firstName;
        NameFormatter.middleName = middleName;
        NameFormatter.lastName = lastName;
        NameFormatter.suffix = suffix;
        return NameFormatter.lastName + ", " + NameFormatter.prefix + " " + NameFormatter.firstName + " " + NameFormatter.middleName + ", " + NameFormatter.suffix;
    }
}
