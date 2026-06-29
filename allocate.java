import java.util.ArrayList;

public class allocate {

    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1; // Not enough books

        int low = arr[0], high = 0;
        for (int i = 0; i < n; i++) {
            high += arr[i];
            if (arr[i] > low) low = arr[i];
        }

        int result = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, n, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private boolean isPossible(int[] arr, int n, int k, int curr_min) {
        int studentsRequired = 1;
        int curr_sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > curr_min)
                return false;

            if (curr_sum + arr[i] > curr_min) {
                studentsRequired++;
                curr_sum = arr[i];

                if (studentsRequired > k)
                    return false;
            } else {
                curr_sum += arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        allocate obj=new allocate();
        int arr[]={12,34,67,90};
        int k=2;
        System.out.println(obj.findPages(arr, k));

    }
}

