public class _03Student {
    //私有属性
    private String name;//姓名
    private int age;//年龄
    private String address;//住址
    private String zipCode;//邮编
    private String mobile;//电话

    //get、set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    //构造方法
    public _03Student(){

    }
    public _03Student(String name,int age,String address,String zipCode,String mobile){
        this.name=name;
        this.age=age;
        this.address=address;
        this.zipCode=zipCode;
        this.mobile=mobile;
    }
    public String getPostAddress(){
        return "地址:"+getAddress()+"  邮编:"+getZipCode();
    }
}
class _03StudentTest{
    public static void main(String[] args) {
        _03Student stu1=new _03Student("周杰伦",18,"中国台湾","000000","18770357401");
        System.out.println(stu1.getPostAddress());
    }
}
