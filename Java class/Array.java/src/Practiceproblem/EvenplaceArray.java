package Pacticeprolem;

public class EvenplaceArray {

    public static void main(String[] args) {


        int [] arr = new int [] {5, 110, 12, 2, 4};

        System.out.println("array even position are: ");

        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}
