package com.lhh.learning.algorithms.lecture.sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     *
     * 冒泡排序：
     * 第一次把数组中最大的数放到数组的末尾
     * 第二次把数组中第二大的数放到数组的倒数第二位，以此类推。
     *
     * @param a
     */
    public static void bubbleSort(int[] a){
        for(int i =0 ;i<a.length-1;i++){
            for(int j = 0; j<a.length-1-i;j++){
                int temp = 0;
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5,6,4,2,1,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
