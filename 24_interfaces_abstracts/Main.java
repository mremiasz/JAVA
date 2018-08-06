import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ShapeCalculator shapeCalc = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;
        while (!readComplete){
            try {
                main.printOptions();
                shape = shapeCalc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny, spróbuj ponownie");
            }
        }
        System.out.println(shape);

        shapeCalc.closeScanner();
    }

    public void printOptions() {
        System.out.println("Wybierz figurę, dla której chcesz obliczyć pole i obwód:");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
}
