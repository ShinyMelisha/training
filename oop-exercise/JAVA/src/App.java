import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class App {
    static Scanner input=new Scanner(System.in);

    static Double height;

    public static void main(String[] args) {
         menu();
        }
    public static void menu(){
        System.out.println("""
                    
                    Hello World!
                        1:Square
                        2:Rectangle
                        3:Circle
                        4:Exit program
                    """);
        System.out.print("Select your shape number:");
        try {
            Integer option = input.nextInt();
            Shape shape =selectShape(option);
            if(shape != null)
                calclulate(shape);
        }
        catch (Exception e){
            System.out.println("Invalid number");
        }

    }

    public static Shape selectShape(int option) {
        Shape shape = null;

            switch (option) {

                case 1:
                    shape = getSquare();
                    break;
                case 2:
                    shape = getRectangle();
                    break;
                case 3:
                    shape = getCircle();
                    break;
                case 4:
                    System.out.println("Exit!!");
                    break;
                default:
                    System.out.println("Invalid");
            }

            return shape;

    }

    public static Squares getSquare(){
        Squares square=null;
        try {
            List<String> properties=new ArrayList<>();
            System.out.print("Enter the side length:");
            Double sideLength = input.nextDouble();
            properties.add("Side length:"+sideLength);

            square=new Squares(sideLength);
            System.out.println(" ");
            square.setProperties(properties);
        }catch (Exception e){
            System.out.println("Invalid value");
            throw e;
        }
        System.out.println("Invalid square");
        return square;
    }

    public static Rectangles getRectangle() {
    Rectangles rectangle=null;
    List<String> properties=new ArrayList<>();
        try {
            System.out.print("Enter the height:");
            height = input.nextDouble();
            properties.add("Height:"+height);

        }
        catch (Exception e){
            System.out.println("Invalid");
            throw e;
        }
        try {
            System.out.print("Enter the width:");
            Double width=input.nextDouble();
            properties.add("Width:"+width);
            rectangle=new Rectangles(height,width);
            rectangle.setProperties(properties);

        }
        catch (Exception e){
            System.out.println("Invalid");
        }
        return rectangle;
  }

    public static Circles getCircle(){
        Circles circle=null;
        System.out.print("Enter the radius:");

        try {
            double radius = input.nextDouble();
            circle =new Circles(radius);
            List<String> properties=new ArrayList<>();
            properties.add("Radius:"+radius);

            circle.setProperties(properties);
            System.out.println(" ");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid value");
        }

        return circle;



  }
  private static void calclulate(Shape shape){
        Double area=shape.calculateArea();
        Double perimeter=shape.calculatePerimeter();
        shape.printResult(shape.getName(),shape.getProperties(),area,perimeter);
  }
}
