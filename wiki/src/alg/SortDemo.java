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
    public int[] quickSort(int[] items) {
        megreSort(items, 0, items.length - 1);
        return items;
    }

//    private int partition(int[] items,int start,int end) {
//        int pivot = items[end];
//        int i=start;
//        for (int j = start; j < end; j++) {
//            if (items[j] < pivot) {
//                if (i == j) {
//                    i++;
//                }else {
//                    int t = items[i];
//                    items[i++] = items[j];
//                    items[j]=t;
//                }
//            }
//        }
//
//        int tmp = items[i];
//        items[i] = items[end];
//        items[end] = tmp;
//        return i;
//    }

    private void megreSort(int[] items, int start, int end) {

        if (start >= end) {
            return;
        }
        int pivot = partIndex(items, start, end);
        megreSort(items, start, pivot - 1);
        megreSort(items, pivot + 1, end);
    }


    private int partIndex(int[] items, int start, int end) {
        int pivot = items[end];
        int left = start;
        for (int i = start; i < end; i++) {
            if (items[i] < pivot) {
                if (left == i) {
                    left++;
                } else {
                    int temp = items[left];
                    items[left++] = items[i];
                    items[i] = temp;
                }
            }
        }
        int temp = items[left];
        items[left] = pivot;
        items[end] = temp;
        return left;

    }

}
