//乐器类
class Instrument{
    public void makeSound(){
        System.out.println("乐器可以演奏出声音");
    }
}
//乐器子类
class Erhu extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("二胡可以演奏出声音");
    }
}
class Piano extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("钢琴可以演奏出声音");
    }
}
class Violin extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("小提琴可以演奏出声音");
    }
}
//乐手类
class Musician{
    public void play(Instrument i){
        i.makeSound();
    }
}
public class _04musicPlay {
    public static void main(String[] args) {
        //初始化乐手
        Musician mc=new Musician();
        //初始化各种乐器
        Instrument erhu=new Erhu();
        Instrument piano=new Piano();
        Instrument violin=new Violin();
        //乐手演奏不同乐器   多态
        mc.play(erhu);
        mc.play(piano);
        mc.play(violin);
    }
}
