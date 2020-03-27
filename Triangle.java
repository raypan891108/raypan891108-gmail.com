class Triangle extends Shape{
    
    private float a,b,angle;
    private double c,area,perimeter;
    public Triangle(float a,float b,float angle){
        super();
        settriangle(a, b, angle);
    }
    public void settriangle(float a,float b,float angle){
        this.a = a;
        this.b = b;
        this.angle = angle;
        c = a * a + b * b - 2 * a * b * Math.cos(angle);
        perimeter = a + b + c;
        double s = (a+b+c) / 2;
        area = Math.sqrt(s*(s-a*(s-b)*(s-c)));
    }

    public float geta(){
        return a;
    }
    public float getb(){
        return b;
    }
    public double getc(){
        return c;
    }
    public double getangle(){
        return angle;
    }
    public double getperimeter(){
        return perimeter;
    }
    public double getparea(){
        return area;
    }

    public void showinfo(){
        System.out.println("Triangle");
        System.out.println("area:" + area);
        System.out.println("perimeter:" + perimeter + "\n");
    }
}