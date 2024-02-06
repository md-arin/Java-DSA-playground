public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 1,2,3};
        System.out.println(search(arr, 0, arr.length - 1, 2));

    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid] ) {
            return mid;
        }

        if (arr[start] < arr[mid]) {
            if (target <= arr[mid] && target >= arr[start]) {
                return search(arr, 0, mid - 1, target);
            }
                return search(arr, mid + 1, end, target);

        }

        if (target >= arr[mid] && target <= arr[end]) {
            return search(arr, mid + 1, end, target);
        }
        return search(arr, start, mid - 1, target);

    }

}