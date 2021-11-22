import java.io.File;

/**
 * 1.（1）.使用文件名称过滤器筛选将指定文件夹下的小于200K的小文件获取并打印。
 * （2）.从键盘接收一个文件夹路径,统计该文件夹大小。
 * （3）.从键盘接收一个文件夹路径,删除该文件夹。
 * （4）.从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
 */
class fileUtil {
    //获取指定文件夹下小于指定大小的文件
    //参数：String floderPath  文件夹路径
    //     int fileSize       限制文件大小  单位 /b
    public static void printFileName(String folderPath, int fileSize) {
        File file = new File(folderPath);
        //判断是否是文件夹,不是文件夹则退出
        if (!file.isDirectory()) {
            return;
        }
        ;
        //遍历文件  并输出
        File[] fs = file.listFiles();
        //空文件夹退出
        if (null == fs)
            return;
        for (File f : fs) {
            //遍历到文件夹则跳过，检查下一个文件
            if (f.isDirectory())
                continue;
            if (f.length() > fileSize) {
                System.out.println("文件：" + f.getName());
            }
        }

    }

    //获取指定文件夹的大小
    //参数：String floderPath  文件夹路径
    public static int getFolderSize(String floderPath) {
        File file = new File(floderPath);

        //遍历文件夹下文件获得总大小
        File[] files = file.listFiles();
        int allFileLength = 0;
        for (File f : files) {
            //是文件夹递归
            if (f.isDirectory()) {
                allFileLength += getFolderSize(f.getPath());
            }
            allFileLength += f.length();
        }
        return allFileLength;
    }

    //删除指定文件夹
    //参数：String floderPath  文件夹路径
    public static void deleteFolder(String floderPath) {
        File file = new File(floderPath);
        if (!file.isDirectory()) {
            return;
        }
        file.delete();
    }

    //按层级打印文件夹、文件名
    //参数：String floderPath  文件夹路径
    public static void forFolderName(String floderPath) {
        File file = new File(floderPath);
//        System.out.println(floderPath);

        File[] files = file.listFiles();
        //先遍历这一层文件的文件名
        for (File f : files) {
            System.out.println(f.getName());
        }
        //再遍历这一层文件夹《递归》
        for (File f : files) {
            if (f.isDirectory()){
                forFolderName(f.getPath());
            }
        }
    }
}

public class Test01 {
    public static void main(String[] args) {
        //1.
        fileUtil.printFileName("yourPath", 1024 * 200);
        //2.
        int length = fileUtil.getFolderSize("yourPath");
        System.out.println("文件夹总大小：" + length);
        //3.
        fileUtil.deleteFolder("yourPath");
        //4.
        fileUtil.forFolderName("yourPath");
    }
}