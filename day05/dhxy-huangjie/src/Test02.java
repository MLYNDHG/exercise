import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str="";
        str=sc.nextLine();

        int upper=0;
        int lower=0;
        int number=0;
        char []c=str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(Character.isUpperCase(c[i])){
                upper++;
                continue;
            }
            if(Character.isLowerCase(c[i])){
                lower++;
                continue;
            }
            if(Character.isDigit(c[i])){
                number++;
                continue;
            }
        }
        System.out.println("大写:"+upper+"\t小写:"+lower+"\t数字:"+number);
    }
}
