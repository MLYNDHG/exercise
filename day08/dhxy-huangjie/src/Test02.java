/**
 * 2.使用生产者和消费者模式实现，交替输出：
 * 假设只有两个线程，输出以下结果：
 * t1-->1
 * t2-->2
 * t1-->3
 * t2-->4
 * t1-->5
 * t2-->6
 * ....
 * <p>
 * 要求：必须交替，并且t1线程负责输出奇数。t2线程负责输出偶数。
 * 两个线程共享一个数字，每个线程执行时都要对这个数字进行：++
 * public class Num {
 * int i;
 * }
 * synchronized(num){
 * if(num是奇数){
 * num.wait();
 * }
 * // 输出偶数
 * // notifyAll()
 * }
 * synchronized(num){
 * if(num是偶数){
 * num.wait();
 * }
 * // 输出奇数
 * // notifyAll();
 * }
 */

//synchronized (this) {
//}
//表示当前对象为同步对象，即也是printNum为同步对象

class printNum {

    public int num = 0;

    public void printN(String name, printNum p) {
        synchronized (this) {
            p.num += 1;
            System.out.println(name + ":" + p.num);
        }
    }
}

class threadPrint extends Thread {
    private String name;
    private printNum p;

    public threadPrint(String name, printNum p) {
        this.name = name;
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.printN(name,p);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test02 {
    public static void main(String[] args) {
        printNum p = new printNum();
        threadPrint t1 = new threadPrint("t1", p);
        t1.start();
        threadPrint t2 = new threadPrint("t2", p);
        t2.start();
    }
}
