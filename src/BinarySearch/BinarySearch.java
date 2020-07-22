package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int low, int high, int value){
        if (high >= low) {
            int mid = low + (high - low)/2;
            if(array[mid] == value){
                return mid;
            }
            if(array[mid] > value){
                return binarySearch(array, low, mid -1, value);
            } else {
                return binarySearch(array, mid + 1, high, value);
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int n, maxSize, k;
        Scanner sc = new Scanner(System.in);
        maxSize = sc.nextInt();
        int[] array = new int[maxSize];
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n < 0 && n > maxSize - 1);

        System.out.println("Nhap gia tri cho phan tu trong mang" );
        for (int i = 0; i < n; i++){
            System.out.print("array[" + i + "] =");
            array[i] = sc.nextInt();
        }
        System.out.println(" Nhap so can tim: ");
        k = sc.nextInt();
        int low = 0;
        int hight = n  -1 ;
        System.out.println ("Vi tri phan tu can tim: " + binarySearch(array,low,hight, k));

    }
}
