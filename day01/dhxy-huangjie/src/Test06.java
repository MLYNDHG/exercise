/**
 * 打车起步价8元（3KM以内）
 * 超过3KM，超出的每公里1.2元
 * 超过5KM，超出的每公里1.5元
 * 请在键盘上接收公里数，得出总价。
 * */
import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kilo;

        System.out.println("请输入公里数:");
        kilo=sc.nextDouble();
        double price;
        if(kilo>0&&kilo<=3){
            price=8;
        }else if(kilo>3&&kilo<=5){
            price=8+(kilo-3)*1.2;
        }else{
            price=8+2*1.2+(kilo-5)*1.5;
        }
        System.out.println("总价："+price);
    }
}
