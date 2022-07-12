import java.util.List;

public class Rectangles extends Shape{

    protected Double height;
    protected Double width;

    @Override
    public List<String> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public Rectangles(Double height,Double width){
        this.name="Rectangle";
        this.height=height;
        this.width=width;
    }
    public Double calculateArea(){
        return height*width;
    }
    public Double calculatePerimeter(){
        return ((height*2)+(width*2));
    }
}
