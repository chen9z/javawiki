import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chen on 2019/8/14.
 */

public class Test {

    public static void main(String[] args) {
//        int [] arr=new int[]{1,2,1};
//        SortDemo demo=new SortDemo();
//        demo.quickSort(arr, 0, arr.length - 1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int[] array = new int[]{0, 3, 2};
        Arrays.sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

}
