import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int n, search, pos = -1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (in sorted order): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to search: ");
        search = sc.nextInt();

        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == search){
                pos = mid;
                break;
            }
            else if(arr[mid] > search){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        if(pos != -1){
            System.out.println(search + " is found at position " + (pos + 1));
        }
        else{
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}