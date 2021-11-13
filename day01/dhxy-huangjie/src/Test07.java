import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("请输入行数:");
        n=sc.nextInt();
        //菱形
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        //**************************************
        //倒三角
        System.out.println("选做倒三角");
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
