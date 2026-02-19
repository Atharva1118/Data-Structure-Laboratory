import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n, choice, pos, value, key;
        String[] log = new String[200];
        int logCount = 0;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        log[logCount++] = "Program started and array initialized";

        do {
            System.out.println("\n--- ARRAY OPERATIONS MENU ---");
            System.out.println("1. Traverse");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Update");
            System.out.println("6. Sort (Ascending)");
            System.out.println("7. Show Log");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();

                    log[logCount++] = "Traversed array";
                    break;

                case 2:
                    System.out.print("Enter position (0 to " + n + "): ");
                    pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    for (int i = n; i > pos; i--)
                        arr[i] = arr[i - 1];

                    arr[pos] = value;
                    n++;
                    System.out.println("Element inserted.");

                    log[logCount++] = "Inserted value " + value +
                            " at position " + pos;
                    break;

                case 3:
                    System.out.print("Enter position (0 to " + (n - 1) + "): ");
                    pos = sc.nextInt();

                    log[logCount++] = "Deleted value " + arr[pos] +
                            " from position " + pos;

                    for (int i = pos; i < n - 1; i++)
                        arr[i] = arr[i + 1];

                    n--;
                    System.out.println("Element deleted.");
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + i);
                            log[logCount++] = "Searched value " + key +
                                    " — found at position " + i;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                        log[logCount++] = "Searched value " + key + " — not found";
                    }
                    break;

                case 5:
                    System.out.print("Enter position (0 to " + (n - 1) + "): ");
                    pos = sc.nextInt();
                    System.out.print("Enter new value: ");
                    value = sc.nextInt();

                    log[logCount++] = "Updated position " + pos +
                            " from " + arr[pos] +
                            " to " + value;

                    arr[pos] = value;
                    System.out.println("Element updated.");
                    break;

                case 6:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Array sorted in ascending order.");
                    log[logCount++] = "Sorted array (ascending)";
                    break;

                case 7:
                    System.out.println("\n--- OPERATION LOG ---");
                    if (logCount == 0)
                        System.out.println("No operations performed yet.");
                    else {
                        for (int i = 0; i < logCount; i++)
                            System.out.println((i + 1) + ". " + log[i]);
                    }
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    log[logCount++] = "Program exited";
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
