package ru.itis.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * 17.12.2020
 * 17. Thread Classes
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TaskExecutors {
    public static TaskExecutor threadPool(int threadsCount, CountDownLatch countDownLatch) {
        return new ThreadPool(threadsCount, countDownLatch);
    }
}
