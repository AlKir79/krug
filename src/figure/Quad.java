package figure;

public class Quad extends Figure {

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.width = width;
    }



    public double square(){
        return this.width*this.height;
    }
    public double perimetr(){
        return (this.height+this.width)*2;
    }
}
