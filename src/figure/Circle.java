package figure;

public class  Circle extends Figure {
    private int radius;

    public Circle(){
        this.radius=5;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double square(){
        return this.radius*this.radius*Math.PI;
    }
    public double perimetr(){
        return 2*Math.PI*this.radius;
    }
}
