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
        //implement

        for(int j=0; j<array.length-1; j++){
            int minimum = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[minimum])
                    minimum = i;
            }

            int x = array[minimum];
            array[minimum] = array[j];
            array[j] = x;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }



    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int n = list. length;
        for (int i=1; i<n; ++i) {
            int key = list(i);
            int j = i-1;

            while (j>=0 && list[j]> key) {
                list[j + 1]= list[j];
                j=j-1;
            }
            list[j + 1] = key;

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        //-----------------

        int tri = list.length;
        for ( int i =  0 ; i < tri -  1 ; i ++ ) {
            for ( int j =  0 ; j < tri - i -  1 ; j ++ ) {
                if (list [j] > list [j +  1 ]) {
                    int temp = list [j];
                    list [j] = list [j +  1 ];
                    list [j +  1 ] = temp;
                }
            }
        }

        final  long endTime =  System . currentTimeMillis ();
        final  long executionTime = endTime - startTime;
        this . executionTime = executionTime;

        return list;
    }





//-----------------------------------
public void merge(int list[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int[] left = new int[n1];
    int[] right = new int[n2];

    for (int i = 0; i < n1; ++i) {
        left[i] = list[l + i];
    }
    for (int j = 0; j < n2; ++j) {
        right[j] = list[m + 1 + j];
    }
    int i = 0, j = 0;

    int k = l;
    while (i < n1 && j < n2) {
        if (left[i] <= right[j]) {
            list[k] = left[i];
            i++;
        } else {
            list[k] = right[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        list[k] = left[i];
        i++;
        k++;
    }

    while (j < n2) {
        list[k] = right[j];
        j++;
        k++;
    }
}



    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int f = 0;
        int s = 0;
        if (f < s) {

            int m = (f + s) / 2;

            mergeSort(list, f, m);
            mergeSort(list, m + 1, s);

            merge(list, f, m, s);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private void mergeSort(int[] list, int l, int m) {
    }


    int partition(int list[], int low, int high) {
        int pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }





    public int[] quickSort(int[] array, int l, int h) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        if (l < h) {

            int pi = partition(list, l, h);

            quickSort(list, l, pi - 1);
            quickSort(list, pi + 1, h);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }




//    public int [] heapSort(int [] array){
//
//        int [] list = array;
//        //implement here






        public int[] bucketSort(int[] array, int maximumValue) {
            final long startTime = System.currentTimeMillis();
            //implement here

            int[] bucket = new int[maximumValue + 1];
            int[] sortedArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                bucket[array[i]]++;
            }
            int op = 0;
            for (int i = 0; i < bucket.length; i++)
                for (int j = 0; j < bucket[i]; j++)
                    sortedArray[op++] = i;


            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return sortedArray;
        }




    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = list.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = list[i];
                int j;
                for (j = i; j >= gap && list[j - gap] > temp; j -= gap) {
                    list[j] = list[j - gap];
                }
                list[j] = temp;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    //-------------------
    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

