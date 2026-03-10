import java.util.*;

public class StackOperations {
    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Maximum size of Stack: ");
        max = sc.nextInt();

        int[] stack = new int[max];
        int top = -1;
        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (top == max - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter Element: ");
                        int value = sc.nextInt();
                        stack[++top] = value;   // increment first, then insert
                        System.out.println("Element Pushed");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped Element: " + stack[top--]);
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Top Element: " + stack[top]);
                    }
                    break;

                case 4:
                    if (top == -1) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("Stack Elements:");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}