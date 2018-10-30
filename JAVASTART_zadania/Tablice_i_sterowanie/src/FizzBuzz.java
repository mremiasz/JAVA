import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
//        for (int i = 1; i < 101; i++){
//            if (i % 3 == 0){
//                System.out.println(i + " Fizz");
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println(i+" FizzBuzz");
//                }
//            }
//            else if (i % 5 == 0){
//                System.out.println(i + " Buzz");
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println(i+" FizzBuzz");
//                }
//            }
//        }

        // strumienie
        IntStream.rangeClosed(1,100)
                .forEach(
                        number ->{
                            if(number%15 == 0)
                                System.out.println(number + " FizzBuzz");
                            else if(number%3 == 0)
                                System.out.println(number + " Fizz");
                            else if(number%5 == 0)
                                System.out.println(number + " Buzz");
                        }
                );
    }
}
