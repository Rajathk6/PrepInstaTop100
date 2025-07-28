import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HundredFourtySeven {
    public static void main(String[] args) {
        // Program 147: Merge Intervals
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        List<int[]> result = mergeIntervals(intervals);

        for (int[] inter : result) {
            System.out.print(Arrays.toString(inter));
        }
    }

    public static List<int[]> mergeIntervals(int[][] intervals) {
        //sort 
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();

        //traverse each index
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]);
            }
        }
        return merged;
    }
}
