public class HundredFourtySix {
    public static void main(String[] args) {
        // Problem 146: Merge two sorted arrays without extra space
        int[] a = {1, 5, 9, 10, 15};
        int[] b = {2, 3, 8, 13};
        merge(a, b, a.length, b.length);
        
        System.out.print("Array A: ");
        for (int num : a) System.out.print(num + " ");
        
        System.out.print("\nArray B: ");
        for (int num : b) System.out.print(num + " ");
    }

    public static void merge (int[] a, int[] b, int m, int n) {
        int gap = nextGap(m+n);

        while (gap>0) {
            int i=0;
            //check a array
            while (i+gap < m) {
                if (a[i] > a[i+gap]) {
                    int temp = a[i];
                    a[i] = a[i+gap];
                    a[i+gap] = temp;
                }
                i++;
            }
            //check both the array
            int j = gap>m ? gap-n : 0;
            while (i < m && j < n) {
                if (a[i] > b[j]) {
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
                i++;
                j++;
            }
            //check b array
            if (j < n) {
                int k = 0;
                while (j+k < n) {
                    if (b[k] > b[j+k]) {
                        int temp = b[k];
                        b[k] = b[j+k];
                        b[j+k] = temp;
                    }
                    k++;
                }
            }
            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap<=1) return 0;
        return (gap+1)/2;
    }
}
