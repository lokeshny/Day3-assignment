package Pacticeprolem;

public class SmallestArray {
    public static void main(String[] args) {


        int[] arr = new int[]{5, 110, 12, 2, 4};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min)
                min = arr[i];
        }


        System.out.println("Smallest element present in given array: " + min);

    }
}