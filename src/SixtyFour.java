public class SixtyFour {
    public static void main(String[] args) {
        // Problem 64: Print All Permutations of a String
        String perm = "abc";
        permutationOfString(perm, 0, perm.length() - 1);
    }

    public static void permutationOfString(String perm, int left, int right) {
        if (left == right) {
            System.out.println(perm);
            return;
        }

        for (int i = left; i <= right; i++) {
            perm = swap(perm, left, i);
            permutationOfString(perm, left + 1, right);
            perm = swap(perm, left, i);
        }
    }

    public static String swap(String perm, int i, int j) {
        char[] arr = perm.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
