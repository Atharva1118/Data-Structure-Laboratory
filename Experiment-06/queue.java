import java.util.Scanner;

class que{
    int front, rear;
    int capacity;
    int array[];

    que(int capacity){
        this.capacity = capacity;
        front = -1;
        rear = -1;
        array = new int[capacity];
    }

    void enqueue(int data){
        if(rear == capacity - 1){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1)
            front = 0;

        rear++;
        array[rear] = data;
    }

    void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(array[front] + " dequeued");
        front++;
    }

    void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }

        for(int i = front; i <= rear; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class queue{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int capacity = sc.nextInt();

        que q = new que(capacity);

        while(true){

            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter element: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

Explain this program