package com.yathushan;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj = Singleton.getInstance();
                System.out.println(obj);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj = Singleton.getInstance();
                System.out.println(obj);
            }
        });

        t1.start();
        t2.start();
    }
}

class Singleton{

    static Singleton singleton;

    private Singleton(){
        if(singleton != null) {
            System.out.println("Please use the getInstance method");
        }

    }

    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }

}


