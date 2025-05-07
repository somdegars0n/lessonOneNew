package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

//        cycle(10);

        String url = "www.example.com";
        String path = "/test/post";
        String body = "Hello World!";

        Sender sender = new Sender(url, path, body);

        System.out.println(sender.send(url, path, body));
    }

    // метод cycle_for
    public static List<Integer> cycle(int count) {
        List<Integer> listNumbers = new ArrayList();

        for (int i = 0; i < count; i++) {

            listNumbers.add(i);
            String result = (i % 2 == 0) ? "even" : "not-even";
            System.out.println(result);
        }

        System.out.println("listNumbers = " + listNumbers);

        return listNumbers;
    }
}