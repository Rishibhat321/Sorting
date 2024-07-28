public class InsertionSort {

    public static void insert(int[] arr,int i)
    {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }

    //Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int[] arr, int n)
    {
        int i;
        for(i=1;i<n;i++)
        {
            insert(arr,i);
        }
    }

    public static void printSortedArray(int[] arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        insertionSort(arr, arr.length);

        printSortedArray(arr);

    }
}
