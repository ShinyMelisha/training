import java.util.List;

public class Circles extends Shape {
    protected Double radius;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<String> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public Circles(Double radius){
        this.name="Circle";
        this.radius=radius;
    }
    public Double calculateArea(){
        return ((22*radius*radius)/7);
    }
    public Double calculatePerimeter(){
        return ((2*22/7)*radius);
    }
}
