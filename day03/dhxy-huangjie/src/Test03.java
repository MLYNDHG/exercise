interface InsertDrawable{
    public void ba();
    public void cha();
}
class computer{
    private String band;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    InsertDrawable id;
}
class mouse implements InsertDrawable{

    @Override
    public void ba() {
        System.out.println("鼠标拔出");
    }

    @Override
    public void cha() {
        System.out.println("鼠标插入");
    }
}
class keyBoard implements InsertDrawable{

    @Override
    public void ba() {
        System.out.println("键盘拔出");
    }

    @Override
    public void cha() {
        System.out.println("键盘插入");
    }
}
class monitor implements InsertDrawable{

    @Override
    public void ba() {
        System.out.println("显示器拔出");
    }

    @Override
    public void cha() {
        System.out.println("显示器插入");
    }
}
class printer implements InsertDrawable{

    @Override
    public void ba() {
        System.out.println("打印机拔出");
    }

    @Override
    public void cha() {
        System.out.println("打印机插入");
    }
}

public class Test03 {
    public static void main(String[] args) {
        computer c=new computer();
        c.setBand("小米");
        c.setPrice(9999f);

        InsertDrawable m=new mouse();
        c.id=m;
        System.out.println(c.getBand());
        c.id.ba();
        c.id.cha();

        InsertDrawable kb=new keyBoard();
        c.id=kb;
        System.out.println(c.getBand());
        c.id.ba();
        c.id.cha();

        InsertDrawable monitor=new monitor();
        c.id=monitor;
        System.out.println(c.getBand());
        c.id.ba();
        c.id.cha();

        InsertDrawable printer=new printer();
        c.id=printer;
        System.out.println(c.getBand());
        c.id.ba();
        c.id.cha();
    }
}
