package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int i = 1; i < array.length; i++)
        {
            int key = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }


    //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int i, j;
        for (i = 0; i < n-1; i++)

            // Last i elements are already in place
            for (j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {
                   int temp = array[j];
                   array[j]= array[j+1];
                   array[j+1] = temp;
                }

        return list;
    }
    void merge(int arr[], int l, int m, int r)
    {

        int i, j, k;
        int n1 = m - l + 1;
        int n2 =  r - m;


        int L[n1], R[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
        {
        arr[k] = L[i];
        i++;
        }
        else
        {
        arr[k] = R[j];
        j++;
        }
        k++;
        }

        while (i < n1)
        {
        arr[k] = L[i];
        i++;
        k++;
        }

        while (j < n2)
        {
        arr[k] = R[j];
        j++;
        k++;
        }

    }
    void mergeSort(int [] array, int l, int r){
       int [] list = array;
        //implement here
        if (l < r)
        {
            // Same as (l+r)/2, but avoids overflow for
            // large l and h
            int m = l+(r-l)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
       }
        return list;
    }




    public int[] quickSort(int arr[], int low,int high)
    {
        if (low < high)
        {
        /* pi is partitioning index, arr[pi] is now
           at right place */
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
    }
    partition (int arr[],int low,int high)
    {
        // pivot (Element to be placed at right position)
        int pivot = arr[high];

        int i = (low - 1)  // Index of smaller element

        for (int j = low; j <= high- 1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                 i++;    // increment index of smaller element
                int swap arr[i] && arr[j];
            }
        }
        int swap arr[i + 1] && arr[high]);
        return (i + 1);
    }



    
    public int [] heapSort(int [] array, int l, int r){
        int [] list = array;
        //implement here
        if (l < r)
        {

            int m = l+(r-l)/2;

            // Sort first and second halves
            mergeSort(array, l, m);
            mergeSort(array, m+1, r);

            merge(array, l, m, r);
        }
        return list;
    }

    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        vector<Integer> b[array.length];

        // 2) Put array elements in different buckets
        for (int i=0; i<array.length; i++)
        {
            int bi = array.length*array[i]; // Index in bucket
            b[bi].push_back(array[i]);
        }

        // 3) Sort individual buckets
        for (int i=0; i<array.length; i++)
            sort(b[i].begin(), b[i].end());

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < b[i].size(); j++)
                array[index++] = b[i][j];




        return list;
    }
    
    public int [] shellSort(int [] array, int n){
        int [] list = array;
        //implement here
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];

                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }
        return 0;


        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
