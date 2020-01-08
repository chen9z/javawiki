package alg;

/**
 * Created by chen on 2019/8/22.
 */
public class Demo {

    public static void main(String[] args) {

        SingleLink<String> singleLink = new SingleLink<String>();
        System.out.println(singleLink.isCircleString(new String[]{"1", "2", "3", "4","5","4","3","2","1"}));
    }
}
