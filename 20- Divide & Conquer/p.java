public class p{
    static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int arr[], int si, int mid, int ei){
        int i = si;
        int j = mid+1;
        int res[] = new int[ei-si+1];
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                res[k] = arr[i];
                i++;
            }
            else{
                res[k] = arr[j];
                j++;
            }
            k++; 
        }

        while(i<=mid){
            res[k++] = arr[i++];
        }

        while(j<=ei){
            res[k++] = arr[j++];
        }

        for(i=si, k=0; k<res.length; i++, k++){
            arr[i] = res[k];
        }
    }

    static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
public static void main(String args[]){
    int arr[] = {8, 3, 4, 10, 1, 5, 2};

    mergeSort(arr, 0, arr.length-1);
    printArr(arr);
}
}