import java.util.Scanner;
public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("请输入一个整数：");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("是一个偶数");
        }else{
            System.out.println("是一个奇数");
        }
    }
}
