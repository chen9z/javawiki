package alg;

public class IpDemo {

    public static long ip2Int(String ip) {
        String[] split = ip.split("\\.");
        long res = 0;
        int len = split.length;
        for (int i = 3; i>=0; i--) {
            long v = Integer.parseInt(split[3-i]);
            res|=v<<(i*8);
        }
        return res;
    }

    public static long ip2Int2(String ip) {
        String[] split = ip.split("\\.");
        long res = 0;
        for (int i = 0; i < split.length; i++) {
            int pow=3-i;
            int v = Integer.parseInt(split[i]);
            res += v * Math.pow(256, pow);
        }
        return res;
    }

    public static void main(String[] args) {
        String ip = "192.168.2.1";
        long l = ip2Int(ip);
        System.out.println(long2Ip(l));
         double m;
        double n;
        m = 192 << 24;
        n= 192 * Math.pow(256, 3);
        System.out.println(m);
        System.out.println(n);

        System.out.println();

    }

    public static String long2Ip(long ip) {
        return ((ip>>24)&0XFF)+"."+
                ((ip>>16)&0XFf)+"."+
                ((ip>>8)&0XFF)+"."+
                (ip&0XFF);
    }
}
