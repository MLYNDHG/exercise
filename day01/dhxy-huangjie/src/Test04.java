import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("请输入整数x:");
        x=sc.nextInt();
        System.out.println("请输入整数y:");
        y=sc.nextInt();
        if(x>y){
            System.out.println(">");
        }else if (x==y){
            System.out.println("=");
        }else{
            System.out.println("<");
        }
    }
}
