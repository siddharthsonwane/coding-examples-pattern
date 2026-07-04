package main.examples;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {

        System.out.println("OuterMethod -> Trying to acquire lock...");

        lock.lock(); // Hold Count = 1

        System.out.println("OuterMethod -> Lock acquired");
        printLockStatus();

        try {

            System.out.println("OuterMethod -> Calling innerMethod()");

            innerMethod();

            System.out.println("OuterMethod -> Returned from innerMethod()");
            printLockStatus();

        } finally {

            System.out.println("OuterMethod -> Releasing lock...");
            lock.unlock(); // Hold Count = 0

            printLockStatus();

            System.out.println("OuterMethod -> Lock completely released");
        }
    }

    public void innerMethod() {

        System.out.println("\nInnerMethod -> Trying to acquire same lock...");

        lock.lock(); // Hold Count = 2

        System.out.println("InnerMethod -> Lock acquired again (Reentrant)");
        printLockStatus();

        try {

            System.out.println("InnerMethod -> Executing critical section");

        } finally {

            System.out.println("InnerMethod -> Releasing one hold...");
            lock.unlock(); // Hold Count = 1

            printLockStatus();

            System.out.println("InnerMethod -> Returned to outerMethod\n");
        }
    }

    private void printLockStatus() {

        System.out.println("----------------------------------------");
        System.out.println("Current Thread : " + Thread.currentThread().getName());
        System.out.println("Hold Count     : " + lock.getHoldCount());
        System.out.println("Is Locked      : " + lock.isLocked());
        System.out.println("Held By Me     : " + lock.isHeldByCurrentThread());
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        ReentrantLockExample example = new ReentrantLockExample();

        example.outerMethod();
    }
}