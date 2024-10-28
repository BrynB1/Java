package Junior.Final;

import java.util.Arrays;

public class Heap {
    int[] arr;
    int idx;

    Heap(int capacity) {
        arr = new int[capacity];
        idx = 0;
    }

    public void add(int value) {
        if (idx == 0) {
            arr[++idx] = value;
        } else {
            idx++;
            arr[idx] = value;
            upHeap(idx);
        }
    }

    public void upHeap(int idx) {
        if (idx == 1) {
            return;
        }
        int parent = idx / 2;
        if (arr[parent] < arr[idx]) {
            return;
        } else {
            swap(parent, idx);
            upHeap(parent);
        }
    }

    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int remove() {
        int root = arr[1];
        arr[1] = arr[idx];
        idx--;
        downHeap(1);
        return root;
    }

    public void downHeap(int idx) {
        int leftChild = idx * 2;
        int rightChild = idx * 2 + 1;
        int smallest = idx;

        if (leftChild <= this.idx && arr[leftChild] < arr[smallest]) {
            smallest = leftChild;
        }
        if (rightChild <= this.idx && arr[rightChild] < arr[smallest]) {
            smallest = rightChild;
        }

        if (smallest != idx) {
            swap(idx, smallest);
            downHeap(smallest);
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap(13);
        h.add(5);
        h.add(6);
        h.add(17);
        h.add(21);
        h.add(4);
        h.add(-1);
        h.add(0);
        h.add(-5);
        h.add(-9);
        h.add(20);
        h.add(3);
        h.add(-3);

        System.out.println("Original Heap: " + Arrays.toString(h.arr));

        int root = h.remove();
        System.out.println("Root element removed: " + root);
        System.out.println("Heap after removing root: " + Arrays.toString(h.arr));
    }
}
