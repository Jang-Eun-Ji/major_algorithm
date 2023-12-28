import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 7};

        // 최초 힙 구성
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = arr.length - 1; i >= 0; i--){
            int temp = 0;
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));


    }

    static void heapify(int[] arr, int root, int size) {
        int largest = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;
        if (leftChild < size && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild < size && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, size);
        }
    }
}