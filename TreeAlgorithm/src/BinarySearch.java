public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 12, 23, 44, 124, 2123, 123123};
        System.out.println("Your index = " + binarySearch(99, array));
    }
    private static int binarySearch(int value, int[] array){
       int lowIndex = 0;
       int highIndex = array.length -1;
       while (lowIndex <= highIndex){
           int middleIndex = (lowIndex + highIndex) / 2;
           if(array[middleIndex] == value){
               return middleIndex;
           }
           if(array[middleIndex] > value){
                highIndex = middleIndex -1;
           }
           else {
               lowIndex = middleIndex +1;
           }
       }
        return -1;
    }
}
