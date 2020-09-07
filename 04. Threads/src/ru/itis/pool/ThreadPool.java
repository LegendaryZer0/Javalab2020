package ru.itis.pool;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * 07.09.2020
 * 01. Threads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

// wait, notify, synchronized
public class ThreadPool {
    // очередь задач
    private Deque<Runnable> tasks;

    // пул потоков
    private PoolWorker threads[];

    public ThreadPool(int threadsCount) {
        this.tasks = new ConcurrentLinkedDeque<>();
        this.threads = new PoolWorker[threadsCount];

        for (int i = 0; i < this.threads.length; i++) {
            this.threads[i] = new PoolWorker();
            this.threads[i].start();
        }
    }

    public void submit(Runnable task) {
        // TODO: реализовать
    }

    // класс - рабочий поток
    private class PoolWorker extends Thread {
        @Override
        public void run() {
            // TODO: реализовать
            while(true) {

            }
        }
    }
}
