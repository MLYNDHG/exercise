import java.util.Scanner;

//异常类
class lengthException extends Exception{
    public lengthException(String message){
        super(message);
    }
}
class UserService{
    public void  register (String username,String password)throws lengthException{
        if(username.length()<6||username.length()>14||password.length()<6||password.length()>14){
            System.out.println("注册失败！");
            throw new lengthException("长度在[6-14]之外");
        }
    }
}
public class Test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username="";
        String password="";
        System.out.println("请输入用户名：");
        username=sc.nextLine();

        System.out.println("请输入密码：");
        password=sc.nextLine();
        UserService userService=new UserService();
        try {
            userService.register(username,password);
        } catch (lengthException e) {
            e.printStackTrace();
        }
        System.out.println("注册成功！");
    }
}
