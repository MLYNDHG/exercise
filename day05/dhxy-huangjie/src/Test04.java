import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个长度为8的字符串:");
        String str=sc.nextLine();
        if(str.length()!=8){
            System.out.println("非法输入！");
        }else{
            System.out.println("原字符串："+str);
            char []c=str.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if(Character.isUpperCase(c[i])){
                    c[i]='M';
                }
            }
            StringBuffer newStr = new StringBuffer();
            for (char s : c) {
                newStr.append(s);
            }
            System.out.println(newStr.toString());
            System.out.println("修改后:"+str);
        }
    }
}
