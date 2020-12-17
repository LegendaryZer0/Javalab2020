package ru.itis.count_down_latch;

/**
 * 17.12.2020
 * 17. Thread Classes
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface TaskExecutor {
    void submit(Runnable task);
}
