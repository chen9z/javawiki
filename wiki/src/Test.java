import alg.MidSearchDemo;

/**
 * Created by chen on 2019/8/14.
 */

public class Test {

    public static void main(String[] args) {
        MidSearchDemo searchDemo = new MidSearchDemo();
        int[] a = new int[]{1, 2,3, 3,4, 6,8,9,10};
        System.out.println(searchDemo.firstPartSearch(a, 3));

    }
}
