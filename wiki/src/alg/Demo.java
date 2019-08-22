package alg;

import java.util.Arrays;

/**
 * Created by chen on 2019/8/22.
 */
public class Demo {

    public static void main(String[] args) {

        SortDemo sortDemo = new SortDemo();
        int[] a = {1, 3, 2, 9, 8, 0, 11, 23, 5};
        System.out.println(Arrays.toString(sortDemo.quickSort(a)));
    }
}
