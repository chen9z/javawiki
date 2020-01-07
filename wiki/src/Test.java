import alg.QueueDemo;

/**
 * Created by chen on 2019/8/14.
 */

public class Test {

    public static void main(String[] args) {
        QueueDemo stackDemo = new QueueDemo(3);
        stackDemo.push("11");
        stackDemo.push("22");
        stackDemo.push("33");
        System.out.println(stackDemo.pop());
        stackDemo.push("44");


        System.out.println(stackDemo.pop());
        System.out.println(stackDemo.pop());
        System.out.println(stackDemo.pop());
    }
}
