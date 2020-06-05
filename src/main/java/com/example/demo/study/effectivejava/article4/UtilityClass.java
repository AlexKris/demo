package com.example.demo.study.effectivejava.article4;

// Non instantiable utility class
public class UtilityClass {
    // Suppress default constructor for non instantiability
    private UtilityClass() {
        throw new AssertionError();
    }

    // Remainder omitted
}
