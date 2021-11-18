import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        //Math.random()返回[0,1)
        int []num=new int[10];
        for (int i = 0; i < 10; i++) {
            num[i]=(int)(Math.random()*100)+1;
        }
        List list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            if(num[i]>=10){
                list.add(num[i]);
            }
        }
        for (Object n :list) {
            System.out.println(n);
        }
    }
}
