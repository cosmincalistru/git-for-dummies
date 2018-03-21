package com.git.dummies.cc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main (String[] args) {
        List<String> words = new ArrayList<>();
        words.add("git");
        words.add("For");
        words.add("dummies");

        System.out.println(words.stream()
                .collect(Collectors.joining(" ")));
    }
}
