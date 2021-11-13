public class _02Book {
    private String title;//名称
    private int pageNum=200;// 页数

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum<200){
            System.out.println("错误信息:不足200页");
            this.pageNum=200;
        }else{
            this.pageNum = pageNum;
        }
    }
    public _02Book(){

    }
    public _02Book(String title,int pageNum){
        this.title=title;
        if(pageNum<200){
            System.out.println("错误信息:不足200页");
            this.pageNum=200;
        }else{
            this.pageNum = pageNum;
        }
    }
    public void detail(){
        System.out.println("教材的名称:"+this.title+"\n页数"+this.pageNum+"\n");
    }

}
class _02BookTest {
    public static void main(String[] args) {
        _02Book book1=new _02Book("微信小程序：开发入门及案例详解 (readOnly) by 李骏  边思 (z-lib.org)",199);
        book1.detail();

        _02Book book2=new _02Book();
        book2.setTitle("数据结构与算法");
        book2.setPageNum(100);
        book2.detail();

        _02Book book3=new _02Book();
        book3.setTitle("编译原理");
        book3.setPageNum(400);
        book3.detail();
    }
}
