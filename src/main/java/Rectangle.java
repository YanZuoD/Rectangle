public class Rectangle {

    private Double length;
    private Double width;

    Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }
    public Double getCircumference() {
        return (this.length + this.width) * 2;
    }

    public Double getArea() {
        return this.length * this.width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }
}
