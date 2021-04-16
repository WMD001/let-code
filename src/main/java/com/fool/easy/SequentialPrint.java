package com.fool.easy;

import java.util.concurrent.CountDownLatch;

/**
 * @author walle
 * @date 2021/4/16 17:41
 **/
public class SequentialPrint {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        foo.third(() -> {
            System.out.println("third");
        });
        foo.second(() -> {
            System.out.println("second");
        });
        foo.first(() -> {
            System.out.println("first");
        });
    }



    static class Foo {

        private final CountDownLatch latch1 = new CountDownLatch(1);
        private final CountDownLatch latch2 = new CountDownLatch(1);

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            latch1.countDown();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (latch1.getCount() != 0) {

            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            latch2.countDown();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (latch2.getCount() != 0) {

            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

}
