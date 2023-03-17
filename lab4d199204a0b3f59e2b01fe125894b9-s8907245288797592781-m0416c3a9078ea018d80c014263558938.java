package com.ht;
//使用多线程 模拟三个窗口同时售票
public class SellTicket {
    public static void main(String[] args) {
      //  SellTicket01 sellTicket01 = new SellTicket01();
       // SellTicket01 sellTicket02 = new SellTicket01();
       // SellTicket01 sellTicket03 = new SellTicket01();

       // sellTicket01.start();
       // sellTicket02.start();
       // sellTicket03.start();

        SellTicket02 sellticket02 = new SellTicket02();
        new Thread(sellticket02).start();
        new Thread(sellticket02).start();
        new Thread(sellticket02).start();

    }
}

class SellTicket01 extends Thread{

    private static int ticketmum = 100; //让多个线程共享该变量
    @Override
    public void run(){
        while (true){
            if (ticketmum <=0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
            System.out.println("窗口"  + Thread.currentThread().getName() + "售出一张票" + "剩余票数 = " + (--ticketmum) );

        }


    }

}
//用接口方式来售票。
class  SellTicket02 implements Runnable{
    private  int ticketmum = 100;
    @Override
    public void run(){
        while (true){
            if (ticketmum <=0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
            System.out.println("窗口"  + Thread.currentThread().getName() + "售出一张票" + "剩余票数 = " + (--ticketmum) );

        }


    }
}
