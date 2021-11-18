import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 2.已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
 String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来
 * */
public class Test02 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list =new LinkedList();
        for (String str: strs) {
            list.add(str);
        }
        System.out.println("集合中的元素："+list.toString());
        //去重
        LinkedList<String> newList=new LinkedList<>();
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String str=it.next();
            if (!newList.contains(str)){
                newList.add(str);
            }
        }
        System.out.println("去除重复元素之后："+newList);
        //迭代器
        System.out.println("----------迭代器-------------");
        it=newList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // 增强for
        System.out.println("----------增强for-------------");
        for (String o :
                newList) {
            System.out.println(o);
        }
    }
}
