public class PassArray {

    // METHOD 1: Passing the entire array (Call-by-Reference)[cite: 1, 2, 4]
    // When you pass an array, you give the method the memory address of the original array[cite: 1, 2].
    public static void modifyArray(int b[]) {
        // A traditional for-loop is required here because we are overwriting data[cite: 4].
        for (int j = 0; j < b.length; j++) {
            b[j] *= 2; // Multiplies the ORIGINAL elements in the array by 2[cite: 4].
        }
    }

    // METHOD 2: Passing a single element (Call-by-Value)[cite: 1, 2, 4]
    // When you pass a primitive (like an int), the method only gets a temporary COPY of the number[cite: 1, 2].
    public static void modifyElement(int e) {
        e *= 2; // This doubles the copy 'e', but the original array remains untouched[cite: 4].
    }

    public static void main(String[] args) {
        // 1. Create the initial array[cite: 4]
        int[] a = { 1, 2, 3, 4, 5 };

        System.out.print("Effects of passing entire array call-by-reference:");
        System.out.println("\nThe values of the original array are:");

        // Print the original array using an enhanced for-loop[cite: 4]
        for (int i : a) {
            System.out.print(" " + i);
        }

        // 2. Pass the ENTIRE array[cite: 4]
        // The modifyArray method will permanently double all elements in 'a'[cite: 4].
        modifyArray(a);

        System.out.println("\n\nThe values of the modified array are:");

        // Print the array again to prove it was modified (Output: 2 4 6 8 10)[cite: 4]
        for (int i : a) {
            System.out.print(" " + i);
        }

        System.out.println("\n\nEffects of passing array element call-by-value:");

        // 3. Check index 3 (which is the number 8, since 4 was doubled)[cite: 4]
        System.out.println("a[3] before modifyElement: " + a[3]);

        // Pass ONLY the number 8 into the method[cite: 4].
        // The method receives a copy, doubles the copy to 16, and then destroys the copy when finished[cite: 4].
        modifyElement(a[3]);

        // 4. Print index 3 again. It will still be 8 because the original was protected[cite: 4].
        System.out.println("a[3] after modifyElement: " + a[3]);
    }
}