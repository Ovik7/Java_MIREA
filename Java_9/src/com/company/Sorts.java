package com.company;

class InsertionSort implements LabClassUI{
    public static Student[] insertionSort(Student[] array) {

        for (int i = 1; i < array.length; i++) {
            Student elem = array[i];
            int j = i - 1;

            while (j >= 0 && (array[j].getId() > elem.getId())) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = elem;
        }

        return array;
    }
}

class MergeSort implements LabClassUI{
    public static void mergeSort(int[] array, int leftIncl, int rightExcl) {

        if (rightExcl <= leftIncl + 1) {
            return;
        }

        int middle = leftIncl + (rightExcl - leftIncl) / 2;

        mergeSort(array, leftIncl, middle);
        mergeSort(array, middle, rightExcl);

        merge(array, leftIncl, middle, rightExcl);
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int i = left;
        int j = middle;
        int k = 0;

        int[] temp = new int[right - left];

        while (i < middle && j < right) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        for (;i < middle; i++, k++) {
            temp[k] = array[i];
        }

        for (;j < right; j++, k++) {
            temp[k] = array[j];
        }

        System.arraycopy(temp, 0, array, left, temp.length);
    }
}

class QuickSort implements LabClassUI{
    public static void quickSort(Student[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(Student[] array, int left, int right) {
        Student pivot = array[right];
        int partitionIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i].compareTo(pivot) < 1) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right);

        return partitionIndex;
    }

    private static void swap(Student[] array, int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}