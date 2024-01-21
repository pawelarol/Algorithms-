import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(sort(List.of(1, 1231, 123,12312,123,123,22,133,444)));
    }

    private static List<Integer> sort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        }

        int pivotIndex = (array.size() - 1) / 2;
        var leftArray = new ArrayList<Integer>();
        var rightArray = new ArrayList<Integer>();

        for (int i = 0; i < array.size(); i++) {
            if (pivotIndex == i) {
                continue;
            }
            var currentElement = array.get(i);

            if (currentElement >= array.get(pivotIndex)) {
                rightArray.add(currentElement);
            } else {
                leftArray.add(currentElement);
            }
        }
            var sortedLeftArray = sort(leftArray);
            var sortedRightArray = sort(rightArray);


            var result = new ArrayList<Integer>();
            result.addAll(sortedLeftArray);
            result.add(array.get(pivotIndex));
            result.addAll(sortedRightArray);
        return result;
    }
}

