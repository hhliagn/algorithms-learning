package com.lhh.learning.algorithms.lecture.sort;

import java.util.Arrays;

public class SelectedSort {

    /**
     *
     * 选择排序
     * 把数组中最小数放到数组的开头
     * 把数组中第二小的数放到数组的第二位，以此类推。
     *
     * 和冒泡排序的区别在于排序过程的不同
     * 选择排序是在剩下的元素中全部遍历一遍选择出最小的，最后数组元素只会交换一次
     * 冒泡排序是相邻的两个一一比较，数组元素有可能要交换很多次
     *
     * @param a
     */
    public static void selectedSort(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length ; j++) {
                if (a[j] < a[min]){
                    min = j;
                }
            }

            if (min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5,6,4,2,1,9};
        selectedSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
