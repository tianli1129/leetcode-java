package Util;

public class Util {

    public static void print2DArray(int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[ " + arr[i][0] + "," + arr[i][1] + " ]");
        }
    }

    public static void print1DArray(int[]arr){
        for (int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}