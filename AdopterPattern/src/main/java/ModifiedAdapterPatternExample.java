import java.util.ArrayList;
import java.util.List;

public class ModifiedAdapterPatternExample {
    public static void main(String[] args) {

        System.out.println("***Adapter Pattern Modified Demo***\n");
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is :  " + rectangle.calculateAreaOfRectangle() + " Square unit.");
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of Triangle is : " + triangle.calculateAreaOfTriangle() + " Square unit.");
        RectInterface adapter = new TriangleAdapter(triangle);
        //Passing a Triangle instead of a Rectangle

        //Some Additional code (Optional) to show the power of adapter
        //pattern
        List<RectInterface> rectangleObjects=new ArrayList<RectInterface>();
        rectangleObjects.add(rectangle);
        rectangleObjects.add(adapter);
    }
}
