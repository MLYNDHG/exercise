import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("请输入整数x:");
        x=sc.nextInt();
        System.out.println("请输入整数y:");
        y=sc.nextInt();
        System.out.println("请输入整数z:");
        z=sc.nextInt();
        if(x>y){
            if(y>z){
                System.out.println(z+" "+y+" "+x);
            }else{
                if(x>z){
                    System.out.println(y+" "+z+" "+x);
                }else{
                    System.out.println(y+" "+x+" "+z);
                }
            }
        }else{
            if(x>z){
                System.out.println(z+" "+x+" "+y);
            }else{
                if(y>z){
                    System.out.println(x+" "+z+" "+y);
                }else{
                    System.out.println(x+" "+y+" "+z);
                }
            }
        }
    }
}
