import java.util.*;

public class ManualHashing {

    static int size;
    static int[] hashTable;

    static int hashFunction(int key) {
        return key % size;
    }

    static void insert(int key) {
        int index = hashFunction(key);

        while (hashTable[index] != -1) {
            index = (index + 1) % size;
        }

        hashTable[index] = key;
        System.out.println("Inserted " + key + " at index " + index);
    }

    static void search(int key) {
        int index = hashFunction(key);
        int startIndex = index;

        while (hashTable[index] != -1) {
            if (hashTable[index] == key) {
                System.out.println("Element found at index " + index);
                return;
            }
            index = (index + 1) % size;

            if (index == startIndex)
                break;
        }

        System.out.println("Element not found");
    }

    static void display() {
    System.out.println("\nIndex     Value");
    System.out.println("----------------");

    for (int i = 0; i < size; i++) {
        if (hashTable[i] == -1)
            System.out.println(i + "         -");
        else
            System.out.println(i + "         " + hashTable[i]);
    }
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of hash table: ");
        size = sc.nextInt();

        hashTable = new int[size];

        Arrays.fill(hashTable, -1);

        int choice;

        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    int key = sc.nextInt();
                    insert(key);
                    break;

                case 2:
                    System.out.print("Enter key to search: ");
                    int searchKey = sc.nextInt();
                    search(searchKey);
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}