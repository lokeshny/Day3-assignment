package Practiceproblem;

public class Duplicateeliment {

    public static void main(String[] args) {

        int [] arr = new int [] {3, 2, 3, 10, 2, 10, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}

