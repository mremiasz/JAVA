public class Romb {
    private static void drawSpacja(int spaces){
        for (int i = 0; i<spaces; i++){
            System.out.print(" ");
        }
    }

    private static void drawGwiazdki(int gwiazdki){
        for (int i = 0; i<gwiazdki; i++){
            System.out.print("*");
        }
    }
    private static void drawLine(int size){
        for (int i =0; i < size; i++){
            drawSpacja(size-i-1);
            drawGwiazdki(size);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawLine(10);
        drawLine(3);
    }
}
