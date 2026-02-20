
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int n,search,pos,flag;
        flag=0;
        pos=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        int [] arr=new int[n];
        
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search: ");
        search=sc.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==search)
            {
                flag=1;
                pos=i;
                break;
            }
        }
        if(flag==1){
            System.out.println(search+" is found at position "+(pos+1));
        }
        else{
            System.out.println("Element Not Found");
        }

    }
    
}
