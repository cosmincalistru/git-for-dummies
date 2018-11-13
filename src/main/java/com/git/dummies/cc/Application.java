package com.git.dummies.cc;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main (String[] args) {
        List<String> words = new ArrayList<>();
        words.add("git");
        words.add("for");
        words.add("dummies");
        words.add("now");

        show();

        System.out.println(words);
    }

    public static void show() {
        System.out.println("for a new commit");
    }
}
