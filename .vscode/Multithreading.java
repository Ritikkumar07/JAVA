class MyThread extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

class Multithreading {
    public static void main(String[] args) {
        MyThread s1 = new MyThread();
        s1.start();  // start thread

        for(int i=1; i<=3; i++) {
            System.out.println("Main: " + i);
        }
    }
}
