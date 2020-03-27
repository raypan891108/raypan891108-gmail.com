class Rectangle extends Shape {
    private float a,b;
    private double area,perimeter;
    public Rectangle(float a,float b){
        super();
        setrectangle(a, b);
    }
    public void setrectangle(float newa,float newb){
        this.a = newa;
        this.b = newb;
        perimeter = 2 *(a+b);
        area = a * b;
    }
    public float geta(){
        return a;
    }
    public float getb(){
        return b;
    }
    public double getarea(){
        return area;
    }
    public double getperimeter(){
        return perimeter;
    }

    public void showinfo(){
        System.out.println("rectangle");
        System.out.println("area:" + area);
        System.out.println("perimeter:" + perimeter + "\n");
    }
}