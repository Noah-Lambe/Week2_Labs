public class Rectangle {
    //    Attributes
    private float length;
    private float width;

    //    Constructors
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //    Getters and Setters
    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    //    toString
    public String toString() {
        return("Rectangle = (" + "Length = " + this.length + ", " + "Width = " + this.width + ")");
    }

    //    Methods
    public void display() {
        System.out.println(this.length + ", " + this.width);
    }
}
