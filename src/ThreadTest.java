class TestThread extends Thread {
    private String name;

    TestThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<30;i++){
            System.out.println(name);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new TestThread("aa")).start();
        new Thread(new TestThread("bb")).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("aaa");
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("bb");
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
    }

}
