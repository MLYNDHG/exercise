//形状父类
public abstract class _05Shape {
    String penColor;//画笔颜色
    boolean isFill;//是否填充

    public _05Shape(String penColor, boolean isFill){
        this.penColor=penColor;
        this.isFill=isFill;
    }
    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public boolean isFill() {
        return isFill;
    }

    public void setFill(boolean fill) {
        isFill = fill;
    }

    public abstract float getShapeArea();//抽象方法  获取面积
    public abstract float getShapePerimeter();//抽象方法  获取周长
}
//长方形子类
class rectAngle extends _05Shape {
    float width;
    float height;
    public rectAngle(String penColor,boolean isFill,float width,float height){
        super(penColor,isFill);
        this.width=width;
        this.height=height;
    }
    @Override
    public String toString() {
        return "画了一个长方形,"+
                "线的颜色："+this.getPenColor()+
                ",有无填充："+ this.isFill+
                ",面积为："+this.getShapeArea()+
                ",周长为："+this.getShapePerimeter();
    }
    @Override
    public float getShapeArea() {
        return this.width*this.height;
    }

    @Override
    public float getShapePerimeter() {
        return (this.width+this.height)*2;
    }
}
//正方形子类
class Square extends _05Shape {
    float width;
    public Square(String penColor,boolean isFill,float width){
        super(penColor,isFill);
        this.width=width;
    }

    @Override
    public String toString() {
        return "画了一个正方形,"+
                "线的颜色："+this.getPenColor()+
                ",有无填充："+ this.isFill+
                ",面积为："+this.getShapeArea()+
                ",周长为："+this.getShapePerimeter();
    }

    @Override
    public float getShapeArea() {
        return width*width;
    }

    @Override
    public float getShapePerimeter() {
        return width*4;
    }
}
//长方形子类
class Circular extends _05Shape {
    private static final float pi=3.14f;//定义一个圆周率
    float radius;
    public Circular(String penColor,boolean isFill,float radius){
        super(penColor,isFill);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "画了一个圆形,"+
                "线的颜色："+this.getPenColor()+
                ",有无填充："+ this.isFill+
                ",面积为："+this.getShapeArea()+
                ",周长为："+this.getShapePerimeter();
    }
    @Override
    public float getShapeArea() {
        return pi*radius*radius;
    }

    @Override
    public float getShapePerimeter() {
        return 2*pi*radius;
    }
}
//画板类
class drawingBoard{
    public void Draw(_05Shape sp){
        String str=sp.toString();
        System.out.println(str);
    }
}
class shapeTest{
    public static void main(String[] args) {
        _05Shape ra=new rectAngle("红色",false,10.0f,5.0f);
        _05Shape sq=new Square("黄色",false,4.0f);
        _05Shape cir=new Circular("绿色",true,3.0f);

        drawingBoard db=new drawingBoard();
        db.Draw(ra);
        db.Draw(sq);
        db.Draw(cir);
    }
}