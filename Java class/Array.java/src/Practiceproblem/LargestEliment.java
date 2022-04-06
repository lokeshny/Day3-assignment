package Pacticeprolem;
public class LargestEliment {
    public static void main(String[] args) {


        int[] arr = new int[]{5, 110, 12, 2, 4};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }


            System.out.println("Largest element present in given array: " + max);

        }
    }
