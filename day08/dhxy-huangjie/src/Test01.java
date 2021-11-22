import java.util.*;

/**
 * 1.java多线程模拟实现12306售票
 * 业务描述
 * 假设有200张票，用4个线程去订票，不能有两个或者以上的线程订到了
 * 同一个票（原因就不说了），当最后一张票卖掉的时候结束，再订就抛
 * 异常提示出票卖完了。
 * 业务分析,要实现以上功能，
 * 1、需要创建一个车票类，初始化票，卖票的接口saleTicket()
 * 2、自定义异常的一个类。
 * 3、创建卖票线程类，在run方法中卖车票。
 * 4、初始化车票的线程,负责初始化车票,也就是初始化Ticket类中的数组。
 * 5、创建主方法进行测试。
 */
class Ticket {
    public Map<Integer, String> getTicketMap() {
        return TicketMap;
    }

    public void setTicketMap(Map<Integer, String> ticketMap) {
        TicketMap = ticketMap;
    }

    public List getTicketNum() {
        return TicketNum;
    }

    public void setTicketNum(List ticketNum) {
        TicketNum = ticketNum;
    }

    //key：票id     value：抢票人
    private Map<Integer, String> TicketMap;
    //存放可抢票id  每抢掉一张  可抢池删除
    List TicketNum;

    public Ticket() {
        TicketMap = new HashMap<>();
        TicketNum = new ArrayList();
        for (int i = 1; i <= 200; i++) {
            TicketMap.put(i, null);
            TicketNum.add(i);
        }
    }
    public synchronized void  saleTicket(String name) throws ticketException {
        if (TicketNum.isEmpty()) {
            throw new ticketException("票已卖完");
        } else {
            //多线程重复调用此方法
            //每次进行  1.可抢票池更新    2.抢票记录更新
            synchronized (TicketNum){
                Iterator it= TicketNum.iterator();
                TicketMap.replace((Integer) it.next(), name);
                it.remove();
            }
        }
    }
}

class ticketException extends Exception {
    public ticketException(String message) {
        super(message);
    }
}

class saleTicketThread extends Thread {
    //    private Map<Integer,String> TicketMap;
//    private HashSet<Integer> TicketNum;
    private Ticket ticket;
    private String name;

    public saleTicketThread(Ticket ticket, String name) {
        synchronized (ticket) {
            this.ticket = (ticket);
            this.name = name;
        }
    }

    @Override
    public void run() {
        //可抢票池不为空  继续抢票
        while (!ticket.getTicketNum().isEmpty()) {
            try {
                ticket.saleTicket(name);
            } catch (ticketException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


public class Test01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        //4个线程抢票
        saleTicketThread st1 = new saleTicketThread(ticket, "st1");
        st1.start();
        saleTicketThread st2 = new saleTicketThread(ticket, "st2");
        st2.start();
        saleTicketThread st3 = new saleTicketThread(ticket, "st3");
        st3.start();
        saleTicketThread st4 = new saleTicketThread(ticket, "st4");
        st4.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Map<Integer, String> TicketMap = ticket.getTicketMap();
        List TicketNum = ticket.getTicketNum();
        System.out.println("买票记录如下：");
        TicketMap.forEach((k, v) -> System.out.println("票号"+k + ",用户：" + v));

    }
}
