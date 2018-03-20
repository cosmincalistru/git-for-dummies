package com.git.dummies.cc;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main (String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Git");
        words.add("for");
        words.add("dummies");

        for (String s: words) {
            System.out.print(s + " ");
        }
    }
}
