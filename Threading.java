package com.Aryan;
class MyThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My first thread is running");
        }
    }
}
  class MyThread2 extends Thread {
        @Override
    public void run() {
        while (true) {
            System.out.println("My second thread is runnning");
        }
    }
}


public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
