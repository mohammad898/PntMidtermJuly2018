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
        //implement here
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int p=0;p<list.length;p++){
            for(int q=0;q<list.length-1;q++){
                if(list[q]>list[q+1]){
                    int temp = list[q];
                    list[q] = list[q+1];
                    list[q+1]=temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    void merge(int list[], int l, int m, int h)
    {
        int i, j, k;
        int leftArrayLength = m - l + 1;
        int rightArrayLength =  h - m;

        int[] leftArray=new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (i = 0; i < leftArrayLength; i++)
            leftArray[i] = list[l + i];
        for (j = 0; j < rightArrayLength; j++)
            rightArray[j] = list[m + 1+ j];

        i = 0;
        j = 0;
        k = l;
        while (i < leftArrayLength && j < rightArrayLength)
        {
            if (leftArray[i] <= rightArray[j])
            {
                list[k] = leftArray[i];
                i++;
            }
            else
            {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArrayLength)
        {
            list[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArrayLength)
        {
            list[k] = rightArray[j];
            j++;
            k++;
        }
    }


    public int [] mergeSort(int [] array,int first_Index,int last_Index){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int l = first_Index;
        int h = last_Index;
        if (l < h)
        {
            int m = l+(h-l)/2;
            mergeSort(list, l, m);
            mergeSort(list, m+1, h);

            merge(list, l, m, h);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    int partition (int list[], int low, int high)
    {
        int pivot = list[high];
        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            if (list[j] <= pivot)
            {
                i++;
                int temp = list[i];
                list[i]=list[j];
                list[j] = temp;

            }
        }

        int temp = list[i+1];
        list[i+1]=list[high];
        list[high] = temp;
        return (i + 1);
    }

    public int [] quickSort(int [] array,int first_Index, int last_Index){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int low = first_Index;
        int high = last_Index;
        if (low < high)
        {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    void heap(int list[], int arrayLength, int rootIndex)
    {
        int largest = rootIndex;
        int leftNodeIndex = 2*rootIndex + 1;
        int rightNodeIndex = 2*rootIndex + 2;


        if (leftNodeIndex < arrayLength && list[leftNodeIndex] > list[largest])
            largest = leftNodeIndex;

        if (rightNodeIndex < arrayLength && list[rightNodeIndex] > list[largest])
            largest = rightNodeIndex;


        if (largest != rootIndex)
        {
            int temp = list[rootIndex];
            list[rootIndex] = list[largest];
            list[largest] = temp;

            heap(list, arrayLength, largest);
        }
    }
    
    public int [] heapSort(int [] array,int arrayLength){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heap(list, arrayLength, i);

        for (int i=arrayLength-1; i>=0; i--)
        {
            int temp =list[0];
            list[0] = list[i];
            list[i] = temp;

            heap(list, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array,int maxArrayElementValue){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int max = maxArrayElementValue;
        int [] bucket=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<list.length; i++) {
            bucket[list[i]]++;
        }

        int position=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                list[position++]=i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
   

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
