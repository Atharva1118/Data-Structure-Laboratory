import java.util.Scanner;
public class insertionsort{
    public static void main(String[] args)
    {
    int n,i,j,key;
    int[] arr=new int[100];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements in the array");
    n=sc.nextInt();
    System.out.println("Enter "+n+" elements: ");
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(i=1;i<n;i++)
    {
        key=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
        
    }
    for(i=0;i<n;i++)
    {
        System.out.print(arr[i]+"===>");
    }
    }
}