package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 10};
        int res = getIndex(arr, 11);
        System.out.println("2 - " + res + " index" );

    }

    public static int getIndex(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
//START
//READ array arr[], key k
//FOR i = 0 to array.length - 1 do
//IF arr[i] = k THEN
//      return i
//return -1;
//END




