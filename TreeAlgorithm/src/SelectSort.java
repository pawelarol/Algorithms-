import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        var array = new int[] {1, 12, 23, 44, 124, 2123, 123123};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int [] array) {
     for(int i = 0; i<array.length; i++){
         int indexMax = i;
         for(int j = 0; j < array.length; j++){
             if(array[i] > array[indexMax]){
                 indexMax = j;
             }
         }
         if(indexMax != 1){
             int temp = array[i];
             array[i] = array[indexMax];
             array[indexMax] = temp;
         }
        }

    }
}
