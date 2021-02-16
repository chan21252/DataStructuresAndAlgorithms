package com.chan.list;

import java.lang.reflect.Array;

/**
 * 顺序表
 */
public class SequenceList {
    private final static int MAX_SIZE = 100;
    private final int[] data = new int[MAX_SIZE];;
    private int size;

    public SequenceList() {
        size = 0;
    }

    public SequenceList(int[] arr, int n) {
        if (n < 0 || n > MAX_SIZE) {
            throw new RuntimeException("插入元素个数错误");
        }

        for (int i = 0; i < n; i++) {
            data[i] = arr[i];
        }
        size = n;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void insert(int num, int index) {
        if (size == MAX_SIZE) {
            throw new RuntimeException("顺序表已满");
        }

        if (index < 0 || index > size) {
            throw new RuntimeException("位置错误");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = num;
        ++size;
    }

    public void remove(int index) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }

        if (index < 0 || index > size - 1) {
            throw new RuntimeException("元素位置错误");
        }

        for (int i = index; i < size - 2; i++) {
            data[i] = data[i + 1];
        }
        --size;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("元素位置错误");
        }

        return data[index];
    }

    public int indexOf(int num){
        for (int i = 0; i < size - 1; i++) {
            if (data[i] == num) {
                return i;
            }
        }

        return -1;
    }
}
