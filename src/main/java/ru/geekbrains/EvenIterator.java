package ru.geekbrains;

import java.util.Iterator;

public class EvenIterator implements Iterable<Character> {
    private final String str;

    public EvenIterator(String str) {
        this.str = str;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < str.length();
            }

            @Override
            public Character next() {
                char ch = str.charAt(counter);
                counter += 2;
                return ch;
            }
        };
    }

    public static void main(String[] args) {
        EvenIterator iter = new EvenIterator("qwerty");
        for (Character ch : iter) {
            System.out.println(ch);
        }
    }
}
