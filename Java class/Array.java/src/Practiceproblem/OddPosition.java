package Pacticeprolem;

public class OddPosition{

    public static void main(String[] args) {


        int [] arr = new int [] {5, 110, 12, 2, 4};

        System.out.println("array Odd Position are: ");

        for (int i =0; i < arr.length; i = i+2){
            System.out.println(arr[i]);
        }
    }
}
