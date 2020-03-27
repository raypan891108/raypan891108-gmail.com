import java.math.*;
class Circle extends Shape{
    private float r;
    private double area,perimeter;
    public Circle(float r){
        super();
        setcircle(r);
    }

    public void setcircle(float newr){
        this.r = newr;
        perimeter = 2.0 * r * Math.PI;
        area = r * r * Math.PI;
    }
    public float getr(){
        return r;
    }
    public double getperimeter(){
        return perimeter;
    }
    public double getarea(){
        return area;
    }


    public void showinfo(){
        System.out.println("Circle");
        System.out.println("area:" + area);
        System.out.println("perimeter:" + perimeter + "\n");
    }

}