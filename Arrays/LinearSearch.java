import java.util.Scanner;

/**
 *
 * @author TUSHAR
 */
public class LinearSearch {

    // Function to search for a key in the list
    public static int Linear_Search(int list[], int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {  // ✅ Check if current element equals key
                return i;          // Return index if found
            }
        }
        return -1; // ✅ Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Enter the number you would like to search inside the list:");
        int key = sc.nextInt();

        // ✅ Store the returned index
        int index = Linear_Search(list, key);

        // ✅ Display results
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key " + key + " is at index " + index);
        }

        sc.close(); // Close scanner
    }
}
