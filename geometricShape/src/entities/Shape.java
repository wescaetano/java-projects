package entities;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double area(){
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%.2f", area());
    }
}
