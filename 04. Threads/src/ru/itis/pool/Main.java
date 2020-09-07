package ru.itis.pool;

/**
 * 07.09.2020
 * 01. Threads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        /*
        Сделать проверки:

        1) Одна задача - один поток
        2) Две задачи - один поток (поочередно выполнить каждую)
        3) Три задачи - три потока (каждый поток выполняет свою задачу)
        4) Четыре задачи - три потока (три потока выполняют три задачи, четвертая задача выполняется первым свободным)
         */
        ThreadPool threadPool = new ThreadPool(2);
    }
}
