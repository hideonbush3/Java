package Thread;

// 멀티스레드
// 하나의 프로세스에서 둘 이상의 스레드가 동시에 작업하는것
// 각 스레드는 해당 프로세스의 메모리를 공유하므로 시스템 자원 관리측면에서 효율적임
// 여러 스레드가 동시에 작업할 수 있어서 사용자와의 응답성이 좋다
public class T02MultiThread {
    // Thread Group
    // 서로 관련있는 스레드를 그룹으로 묶는다
    // 스레드 그룹은 다른 스레드 그룹도 포함할 수 있고
    // 이렇게 포함된 스레드 그룹들은 트리형태로 연결된다
    // 이럴때, 각 스레드는 본인 그룹 또는 하위 그룹에는 접근할 수 있지만
    // 다른 그룹에는 접근하지 못한다
    // 즉, 스레드 그룹은 스레드가 접근할 수 있는 범위를 설정할 수 있어서 보안상으로 중요한 장치다

    public static void main(String[] args) {
        Thread thread0 = new Thread(new CustomThread());
        thread0.start();

        // 메인 메서드에서 생성된 스레드의 기본 스레드 그룹의 이름은 main, 최대 우선순위는 10으로 자동할당됨
        System.out.println(thread0.getThreadGroup()); // java.lang.ThreadGroup[name=main,maxpri=10]

        ThreadGroup tg = new ThreadGroup("my-tg");
        tg.setMaxPriority(5);       // 새로 만든 스레드 그룹의 최대 우선순위 값 5 지정
        Thread thread1 = new Thread(tg, new CustomThread());
        thread1.start();
        System.out.println(thread1.getThreadGroup()); // java.lang.ThreadGroup[name=my-tg,maxpri=5]
    }
    
}

class CustomThread implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
