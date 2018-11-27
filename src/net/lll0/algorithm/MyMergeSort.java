package net.lll0.algorithm;


import java.util.Arrays;

/**
 * 归并排序
 */
public class MyMergeSort {

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
            System.out.println("--->  " + Arrays.toString(temp));

        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= high) {
            temp[k++] = a[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

    /**
     * 数组分解
     *
     * @param a
     * @param low
     * @param high
     */
    public static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        System.out.println("mid   " + mid);
        if (low < high) {
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }

    }

    public static void main(String[] arg) {
//        int a[] = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50};
        int a[] = {51, 46, 20, 18};
        MyMergeSort.mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }


    public static void println(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");

    }
}