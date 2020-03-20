import alg.MidSearchDemo;
import alg.RecentCounter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by chen on 2019/8/14.
 */

public class Test {

    public static void main(String[] args) {
        int number = 1;
        System.out.println((1 << 30)+1);

        MidSearchDemo midSearchDemo = new MidSearchDemo();
        System.out.println(midSearchDemo.countCharacters(new String[]{"hello","world","leetcode"},"welldonehoneyr"));
        int[] a = new int[]{};
        int[] b = new int[]{};

        System.out.println(3 / 2 * 2);

        RecentCounter counter = new RecentCounter();
        System.out.println(Arrays.toString(counter.getLeastNumbers(new int[]{0, 0, 1, 2, 4, 2, 2, 3, 1, 4}, 8)));
    }

}
