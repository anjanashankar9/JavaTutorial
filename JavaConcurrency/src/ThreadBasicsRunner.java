
/*
2 ways :
1. extends Thread
2. implements Runnable

NEW
RUNNABLE
RUNNING
BLOCKED/WAITING
TERMINATED/DEAD
 */

class Task1 extends Thread {
    public void run() {
        System.out.println("Task 1 started");
        for(int i=101; i<=199; i++) {
            System.out.println(i+ " ");
        }
        System.out.println("Task 1 completed");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Task 2 started");
        for(int i=201; i<=299; i++) {
            System.out.println(i+ " ");
        }
        System.out.println("Task 2 completed");
    }
}

public class ThreadBasicsRunner {
    public static void threadBasic(String args[]) {

        //task1
        Task1 task1 = new Task1();
        task1.start();

        //task2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        //task3
        System.out.println("Task 3 started");
        for(int i=301; i<=399; i++) {
            System.out.println(i+ " ");
        }
        System.out.println("Task 3 completed");

        System.out.println("Main Completed");
    }
}
