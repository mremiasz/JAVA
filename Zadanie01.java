import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Zadanie01 {
    interface Figure {
        double getPerimeter();
        double getArea();
        String getType();
    }
    public static class Circle implements Figure {
        double radius;

        Circle() {
            radius = 0;
        }

        Circle(double r) {
            radius =r;
        }

        void setRadius(double new_radius){
            radius = new_radius;
        }

        @Override
        public double getPerimeter() {
            return 2*Math.PI*radius;
        }

        @Override
        public double getArea() {
            return Math.PI*radius*radius;
        }

        @Override
        public String getType() {
            return "Circle";
        }
    }

    public static class Triangle implements Figure{
        double a,b,c,h;

        Triangle() {
            a=b=c=h=0;
        }

        Triangle(double A, double B, double C, double H) {
            a = A;
            b=B;
            c=C;
            h=H;
        }
        void setA(double new_a){
            a = new_a;
        }
        void setB(double new_b){
            b = new_b;
        }
        void setC(double new_c){
            c=new_c;
        }
        void setH(double new_H){
            h=new_H;
        }

        @Override
        public double getPerimeter() {
            return a+b+c;
        }

        @Override
        public double getArea() {
            return a*h/2;
        }

        @Override
        public String getType() {
            return "Triangle";
        }
    }

    public static class Rectangle implements Figure{
        double width, height;

        Rectangle() {
            width=height=0;
        }


        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        void setHeight(double new_height){
            height = new_height;
        }
        void setWidth(double new_width){
            width = new_width;
        }

        @Override
        public double getPerimeter() {
            return 2*height+2*width;
        }

        @Override
        public double getArea() {
            return height*width;
        }

        @Override
        public String getType() {
            return "Rectangle";
        }
    }

    public static void main(String[] args) {
        Circle kółko = new Circle();
        Triangle trojkąt = new Triangle();
        Rectangle kwadrat = new Rectangle();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promien koła: ");
        double cyfra = scanner.nextDouble();
        kółko.setRadius(cyfra);

        System.out.println("Podaj 3 boki trójkąta, po każdej liczbie wciśnij {ENTER]:");
        cyfra = scanner.nextDouble();
        trojkąt.setA(cyfra);
        cyfra = scanner.nextDouble();
        trojkąt.setB(cyfra);
        cyfra = scanner.nextDouble();
        trojkąt.setC(cyfra);
        System.out.println("Podaj wysokość trójkata, potem wciśnij {ENTER]:");
        cyfra = scanner.nextDouble();
        trojkąt.setH(cyfra);

        System.out.println("Podaj 2 boki czworokąta, po każdej liczbie wciśnij [ENTER]:");
        cyfra = scanner.nextDouble();
        kwadrat.setHeight(cyfra);
        cyfra = scanner.nextDouble();
        kwadrat.setWidth(cyfra);

        ArrayList<Figure> lista = new ArrayList<>();
        lista.add(kółko);
        lista.add(trojkąt);
        lista.add(kwadrat);

        Iterator<Figure> itr = lista.iterator();
        while (itr.hasNext()){
            Figure figura = itr.next();
            System.out.println(String.format(figura.getType()+", pole: %.2f, obwód: %.2f.",figura.getArea(),figura.getPerimeter()));
        }
    }
}
