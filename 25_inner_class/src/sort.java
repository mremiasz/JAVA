public class sort implements sortable{
    @Override
    public int[] sort(int[] tab) {
        int temp;
        for (int i = 0; i< tab.length; i++){
            for (int j = 1; j< tab.length-i; j++ ){
                if (tab[j-1] > tab[j]) {
                    temp = tab[j];
                    tab[j]=tab[j-1];
                    tab[j-1] = temp;
                }
            }
        }
        return tab;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,5,7,8,3,2,1,5,9,3,2,1,55,6,9,11,20,30,50,4};
        sortable sortowanie = new sort();
        sortowanie.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
