package alg;

/**
 * 排序算法
 * Created by chen on 2019/8/21.
 */
public class SortDemo {

    /**
     * 冒泡排序
     *
     * @param items
     */
    public int[] bubbleSort(int[] items) {
        if (items.length <= 1) return items;

        int len = items.length;
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int t = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = t;
                    flag = true;
                }
            }
            if (flag = false) break;
        }
        return items;
    }

    /**
     * 插入排序
     *
     * @param items
     * @return
     */
    public int[] insertSort(int[] items) {
        if (items.length <= 1) return items;

        int len = items.length;
        for (int i = 1; i < len; i++) {
            int value = items[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (items[j] > value) {
                    items[j + 1] = items[j];
                } else {
                    break;
                }
            }
            items[j + 1] = value;
        }
        return items;
    }

    /**
     * 快速排序
     *
     * @param items
     * @return
     */
    public void quickSort(int[] items) {
        int len = items.length;
        int p=partition(items);

        megreSort(items, p, len);
    }

    private int partition(int[] items) {
        return 0;
    }

    private void megreSort(int[] items, int start, int end) {

        if (start >=end) {
            return;
        }
        int pivot = items[end];

        int i = start, j = end;
        while (i < j) {
            if (items[i] > pivot) {

            }
        }
    }

}
