class Pet{
    String name;
    public Pet(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println("宠物吃东西！");
    }
}
class Dog extends Pet{
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("小狗"+name+"吃东西！");
    }
}
class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("小猫"+name+"吃东西！");
    }
}
class YingWu extends Pet{
    public YingWu(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("小鹦鹉"+name+"吃东西！");
    }
}
class Master{
    public void feed(Pet pet){
        pet.eat();
    }
}
public class Test01 {
    public static void main(String[] args) {
        Master m=new Master();
        Pet dog=new Dog("豆豆");
        Pet cat=new Cat("凯蒂");
        Pet yingwu=new YingWu("八哥");

        m.feed(dog);
        m.feed(cat);
        m.feed(yingwu);
    }

}
