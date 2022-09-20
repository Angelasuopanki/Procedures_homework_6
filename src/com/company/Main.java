package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 0};
        System.out.println(alternate(a));
    }

    static int[] alternate(int[] a) {
        int l = a.length - 1;
        int k = 0;
        int[] b = new int[a.length - 1];
        for (int i = 0; i < b.length ; i = i + 2) {
            b[i] = a[k];
            k = k + 1;
        }
        for (int i = 1; i < b.length ; i = i + 2){
            b[i] = a[l];
            l = l - 1;
        }
        for (int v : b)
            System.out.println(v);
        return b;

    }
}
