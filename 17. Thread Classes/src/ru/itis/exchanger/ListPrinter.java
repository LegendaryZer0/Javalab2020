package ru.itis.exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * 14.12.2020
 * 17. Thread Classes
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ListPrinter implements Runnable {

    private Exchanger<List<Integer>> exchanger;

    public ListPrinter(Exchanger<List<Integer>> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        while (true) {
            List<Integer> currentList = null;
            try {
                currentList = exchanger.exchange(null);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
            // получить список из другого потока
            System.out.println(currentList);
        }
    }
}
