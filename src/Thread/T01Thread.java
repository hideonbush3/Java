package Thread;
public class T01Thread {
    // 프로세스내에서 실제로 작업을 하는 주체
    // 자바에서 스레드 생성 방법은 두가지
    // 1. Thread 클래스를 상속
    // 2. Runnable 인터페이스를 구현
    // 두 방식 모두 스레드에서 수행할 작업을 run() 메서드에 작성

    public static void main(String[] args) {
        ExtendsThread thread0 = new ExtendsThread();
        Thread thread1 = new Thread(new ImplementsRunnable());

        thread1.setPriority(10);

        thread0.start();
        thread1.start();

        System.out.println(thread0.getPriority());
        System.out.println(thread1.getPriority());
    }
}

// Thread 클래스 상속
class ExtendsThread extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(getName());
            try {
                Thread.sleep(10);   // 스레드를 0.01초동안 중단
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

// Runnable 인터페이스 구현
class ImplementsRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 

}