import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        //if
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("请输入当前份！");
        num=sc.nextInt();
        if(3<=num&&num<=5){
            System.out.println("春季");
        }else if(6<=num&&num<=8){
            System.out.println("夏季");
        }else if(9<=num&&num<=11){
            System.out.println("秋季");
        }else if(1==num||num==2||num==12){
            System.out.println("冬季");
        }
        //switch
        switch (num){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
        }
    }
}