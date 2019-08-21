package alg;

/**
 * Created by chen on 2019/8/14.
 */
public class ListLinkDemo {


    /**
     * 链表反转
     *
     * @param node
     * @return
     */
    public static Node reverse(Node node) {
        Node cur = node, pre = null;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    /**
     * 链表中环的检测
     *
     * @param node
     * @return
     */
    public static boolean isCircle(Node node) {
        if (node == null) return false;
        Node fast = node.next;
        Node slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }

    /**
     * 合并两个有序的链表
     *
     * @param m
     * @param n
     * @return
     */
    public static Node addNode(Node m, Node n) {
        Node res = new Node(null);
        while (m != null && n != null) {
            if (m.val > n.val) {
                res.next = n;
                n = n.next;
            } else {
                res.next = m;
                m = m.next;
            }
            res = res.next;
        }
        if (m != null) res.next = m;
        if (n != null) res.next = n;
        return res.next;
    }

    /**
     * 删除倒序第n个节点
     *
     * @param list
     * @param k
     * @return
     */
    public static Node deleteNode(Node list, int k) {
        Node cur = list, pre = list;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }
        if (cur.next == null) return pre;

        while (cur.next != null) {
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return list;
    }

    /**
     * 求中间节点
     *
     * @param list
     * @return
     */
    public static Node getCenterNode(Node list) {
        if (list == null) return null;
        Node fast = list;
        Node slow = list;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
