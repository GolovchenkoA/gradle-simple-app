package org.exemple;

import org.example.TheSameNamesForDifferentTypesKt;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = TheSameNamesForDifferentTypesKt.filterValid(List.of("a", "b", ""));
        strings.forEach(System.out::println);
        List<Integer> ints = TheSameNamesForDifferentTypesKt.filterValidInt(List.of(1,2,0));
        ints.forEach(System.out::println);
    }
}
