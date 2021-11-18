abstract class Weapon{
    public abstract void attack();
    public abstract void move();
}
class Tank extends Weapon{

    @Override
    public void attack() {
        System.out.println("tank进行攻击");
    }

    @Override
    public void move() {
        System.out.println("tank进行移动");
    }
}
class Flighter extends Weapon{

    @Override
    public void attack() {
        System.out.println("Flighter进行攻击");
    }

    @Override
    public void move() {
        System.out.println("Flighter进行移动");
    }
}
class WarShip extends Weapon{

    @Override
    public void attack() {
        System.out.println("WarShip进行攻击");
    }

    @Override
    public void move() {
        System.out.println("WarShip进行移动");
    }
}

public class Test02 {
    public static void main(String[] args) {
        Weapon tank=new Tank();
        Weapon warShip=new WarShip();
        Weapon flighter=new Flighter();

        tank.attack();
        tank.move();
        warShip.attack();
        warShip.move();
        flighter.attack();
        flighter.move();
    }
}
