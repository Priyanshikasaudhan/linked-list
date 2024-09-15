// import java.util.Scanner;

// public class subarray {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int arr[] = {1,2,3};
//         int f = 1;
//         for(int i=1;i<=arr.length;i++){
//             f= f*i;
//             System.out.println(f);
//         }
//         boolean found = false;
//         for(int i=0;i<arr.length;i++ ){
//             int pair = arr[i];
//         for(int j=i+1;j<arr.length;j++){
//             int crr = arr[j];
//         for(int k=j+1;k<arr.length;k++){
//             int next = arr[k];
        
//         if (pair*crr*next == f) {
//             System.out.println("[" + pair + "," + crr + " , " + next + " ]");
//             found = true;
//         } 
//         int temp;
//         temp = crr;
//         next = temp;
//         crr = next;
//         }
//     }
//     }
//     if (!found) {
//         System.out.println("No triplet found with product equal to factorial!");
//     }
//     }
// }
public class subarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};  // Array of elements

        // Calculating factorial of the array length
        int f = 1;
        for (int i = 1; i <= arr.length; i++) {
            f = f * i;
        }
        System.out.println("Factorial of array length (" + arr.length + ") is: " + f);

        // Generate all possible pairs and swap
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for(int k=j+1;k<arr.length;k++)
                // Print the original pair
                System.out.println("Original pair: [" + arr[i] + ", " + arr[j] + ","+ arr[k] +"]");

                // Swap the two elements
                swap(arr, i, j);

                // Print the array after the swap
                System.out.print("Array after swap: ");
                printArray(arr);

                // Check if the product of swapped elements equals the factorial
                if (arr[i] * arr[j] == f) {
                    System.out.println("Pair with product equal to factorial: [" + arr[i] + ", " + arr[j] + "]");
                    found = true;
                }

                // Swap back to restore the original array
                swap(arr, i, j);
            }
            
        }

        if (!found) {
            System.out.println("No pair found with product equal to factorial!");
        }
    }

    // Helper method to swap elements at index i and j in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
