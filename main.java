import java.util.ArrayList;

public class main{
    public static void main(String[] args){
        ArrayList <Shape> shapelist = new ArrayList<Shape>();

        shapelist.add(new Circle(3));

        shapelist.add(new Triangle(3,4,90));

        shapelist.add(new Rectangle(3, 4));

        System.out.println("total:" + Shape.counts);

        for(int i=0;i<shapelist.size();i++){
            shapelist.get(i).showinfo();
        }


    }
}