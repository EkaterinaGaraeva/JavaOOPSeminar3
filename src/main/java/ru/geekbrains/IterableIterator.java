package ru.geekbrains;

import java.util.Iterator;

public class IterableIterator implements Iterable<Integer>{

    private final int start;
    private final int stop;

    public IterableIterator(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int counter = start;
            @Override
            public boolean hasNext() {
                return counter <= stop;
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }

    public static void main(String[] args) {
        IterableIterator iterator = new IterableIterator(1, 10);
        for (Integer integer : iterator) {
            System.out.println(integer);
        }

    }
}
