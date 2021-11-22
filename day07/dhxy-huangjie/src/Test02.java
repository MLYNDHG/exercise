import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 2.键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数,
 * 注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
 * 用个数作为value,放入到map集合中,并用两种方式遍历map集合
 *     例如：
 *     doc 的类型的文件有  3 个
 *     java 的类型的文件有  5 个
 *     txt 的类型的文件有  7 个
 * */
class Util{
    public Map<String,Integer> getFileTypeNum(String folderPath){
        File file=new File(folderPath);
        File[] files=file.listFiles();
        Map<String,Integer> map=new HashMap<>();

        for (File f :files) {
            //文件夹不统计
            if(f.isDirectory()){
               continue;
            }
            //没有后缀的不统计
            if(f.getName().contains(".")){
                String[] strArr = f.getName().split("\\.");
                String type=strArr[(strArr.length-1)];
                if(map.containsKey(type)){
                    map.put(type, map.get(type)+1);
                }else{
                    map.put(type,1);
                }
            }
        }
        //文件夹  递归
        for (File f :files) {
           if(f.isDirectory()){
               map.putAll(getFileTypeNum(f.getPath()));
           }
        }
        return map;
    }
}
public class Test02 {
    public static void main(String[] args) {
        Util util=new Util();
        Map<String,Integer>  map=util.getFileTypeNum("C:\\Users\\马里亚纳大海沟\\Desktop\\社会主义");
        map.forEach((k,v)-> System.out.println("文件类型："+k+"有"+v+"个"));
    }
}
