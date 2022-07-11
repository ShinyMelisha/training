import java.util.List;

public class Squares extends Shape {

    protected Double sideLength;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }


    public Squares(Double sideLength){
        this.name="Square";
        this.sideLength=sideLength;
    }
    @Override
    public Double calculateArea(){
        return sideLength*sideLength;
    }
    @Override
    public Double calculatePerimeter(){
        return (sideLength*4);
    }
}
