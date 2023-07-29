import java.util.Scanner;

class stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];

    void push() {
        if (top == (n - 1)) {
            System.out.println("Stack Overflow");
        } else {
            System.out.println("Enter data");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            // sc.close();
            top = top + 1;
            a[top] = i;
            System.out.println("Item inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }

    }

    void display() {
        for (int j = top; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }
}

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        // sc.close();
        s.push();
        s.pop();

        s.display();
        // int d;

        // System.out.println("Press 1 to add elements");
        // System.out.println("Press 2 to delete elements");
        // System.out.println("Press 3 to display elements");
        // System.out.println("Enter your choice");
        // d = sc.nextInt();
        // switch (d) {
        //     case 1: {
        //         s.push();

        //         break;
        //     }

        //     case 2: {
        //         s.pop();
        //         break;
        //     }

        //     case 3: {
        //         s.display();
        //         break;
        //     }

        //     // default:
        //     // break;
        // }

    }

}
