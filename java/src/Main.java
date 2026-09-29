// Java program for Merge Sort

class Merge2 {

    // Merges two subarrays of a[]
    void merge(int arr[], int low, int mid, int high)
    {
        int left = mid - low + 1;
        int right = high - mid;
        int L[] = new int[left];
        int R[] = new int[right];
        for (int i = 0; i < left; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < right; ++j)
            R[j] = arr[mid + 1 + j];
        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        int k = low;
        while (i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < low) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < right) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts a[l..r] using
    // merge()
    void sort(int arr[], int low, int high)
    {
        if (l < r) {
            int mid = (low + high) / 2;
            // Sort first and second halves
            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        // Calling of Merge Sort
        Merge2 ob = new Merge2();
        ob.sort(arr, 0, arr.length - 1);

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
