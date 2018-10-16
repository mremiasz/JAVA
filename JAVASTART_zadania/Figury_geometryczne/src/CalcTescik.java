public class CalcTescik {
    public static void main(String[] args) {
        Kalkulator cal = new Kalkulator();

        Point p1 =new Point(1.1,2.3);
        Point p2 =new Point(1.5,4.3);
        Point p3 =new Point(7.1,8.3);
        Point p4 =new Point(10.1,1.3);

        Rectangle rectangle = new Rectangle(p1,p2,p3,p4);

        System.out.println(rectangle + " area = " + cal.area(rectangle));

        Circle circle = new Circle(p1,3.5);

        System.out.println(circle + " area = "+cal.area(circle));
        System.out.println(cal.isInside(circle,p1));
        System.out.println(cal.isInside(circle,p2));
        System.out.println(cal.isInside(circle,p3));
        System.out.println(cal.isInside(circle,p4));
    }
}