public class Triangle implements Shape{
    private double height;
    private double a,b,c;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c,double h) {
        setA(a);
        setB(b);
        setC(c);
        setHeight(h);
    }

    @Override
    public double calculateArea() {
        return a * height/2;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkąt, ");
        sb.append("bok A: " + a + ", ");
        sb.append("bok B: " + b + ", ");
        sb.append("bok B: " + c + ", ");
        sb.append("wysokość: " + height + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
}
