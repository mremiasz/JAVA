import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {
        Integer[] numbers = {5,66,33,36,2,5,99,6,3,1,5,6,8,8,6,66,44,2,3,6,100};

        System.out.println("Nieposortowana tablica:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Posortowane rosnąco: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });

        System.out.println("Posortowane malejąco: ");
        System.out.println(Arrays.toString(numbers));
    }
}
