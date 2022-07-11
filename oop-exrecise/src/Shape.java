import java.util.ArrayList;
import java.util.List;

public class Shape {
    protected String name;
    protected List<String> properties;

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Double calculateArea(){
        return 0.0;
    }

    protected Double calculatePerimeter(){
        return 0.0;
    }

    protected void printResult(String name, List<String> properties, Double area, Double perimeter){
        System.out.println("Shape:"+name);
        System.out.println("Properties:");
        for(String property: properties){
            System.out.println(property);
        }
        System.out.println("Ärea:"+area);
        System.out.println("Perimeter:"+perimeter);
    }



}
