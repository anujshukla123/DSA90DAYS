package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 21, 9, 21};

        // Edge case check
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be equal).");
        } else {
            System.out.println("Second Largest: " + secondLargest);
            System.out.println("Largest: " + largest);
        }
    }
}

