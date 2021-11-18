import java.util.Scanner;

class QQlogin{
    public boolean login(String username,String password){
        if (username.equals("admin")&&password.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
public class Test03 {
    public static void main(String[] args) {
        QQlogin QQ=new QQlogin();
        Scanner sc=new Scanner(System.in);
        int stauts=0;
        System.out.println("开始QQ登录：");
        for (int i = 1; i <= 3; i++) {
            System.out.println("username：");
            String username= sc.nextLine();
            System.out.println("password：");
            String password= sc.nextLine();
            if(QQ.login(username,password)){
                System.out.println("登录成功");
                stauts=1;
                break;
            }else{
                System.out.println("账户密码错误,重新登录,已失败"+i+"次");
            }
        }
        if(stauts==0){
            System.out.println("登录失败");
        }
    }
}
