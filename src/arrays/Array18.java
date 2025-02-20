package arrays;

public class Array18 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int count = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        int lastE = arr[9];
        int r = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] < lastE) {
                r = arr[i];
                break;
            }
        }
        System.out.println("\nFirst element satisfying A[K] < A[10]: " + r);
    }

}

