import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        var array = new int[] {1, 12, 23, 44, 124, 2123, 123123};
        System.out.println(factorial(5));
        System.out.println(sumElements(array));
    }

    private static int factorial(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        } else {
            return n * factorial(n -1);
        }
    }

    private static int sumElements(int [] array){
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return 1;
        }
        else {
            return array[0] + sumElements(Arrays.copyOfRange(array,1,array.length));
        }
    }
}
