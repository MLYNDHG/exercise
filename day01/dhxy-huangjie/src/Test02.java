import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("请输入一个整数：");
        num=sc.nextInt();
        if(num<0){
            System.out.println("是一个负数");
        }else if(num>0){
            System.out.println("是一个正数");
        }
    }
}
