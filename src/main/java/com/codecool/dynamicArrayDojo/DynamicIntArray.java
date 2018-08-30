package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    int[] arr = new int[0];

    public DynamicIntArray() {

    }

    public DynamicIntArray(int num) {
        arr = new int[num];
    }


    @Override
    public String toString() {
        String stringResult = "";
        for (int i = 0; i < arr.length; i++) {
            stringResult += " " + arr[i];
        }
        return stringResult;
    }

    public void add(int num) {
        int[] temporaryResult = new int[arr.length +1];
        for (int i = 0; i < arr.length; i++) {
            temporaryResult[i] = arr[i];
        }
        temporaryResult[temporaryResult.length -1] = num;
        arr = temporaryResult;
    }

    public void remove(int index) {
        int[] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, arr.length);
        if (index > arr.length)
            result = arr;
        else if (index < arr.length)
            result = arr;
        else {
            int[] temporaryResult = new int[arr.length - 1];
            int x = 0;
            for (int i = 0; i < arr.length; i++) {
                if(i != index) {
                    temporaryResult[i-x] = arr[i];
                } else {
                    i++;
                    x--;
                }
            }
            arr = temporaryResult;
            System.arraycopy(temporaryResult, 0, result, 0, temporaryResult.length);
        }
        arr = result;
    }

    public void insert(int index, int num) {
        int[] temporaryResult = new int[arr.length + 1];
        int x = 0;
        if (index > temporaryResult.length){
            for (int i = 0; i < arr.length; i++) {
                temporaryResult[i] = arr[i];
            }
            temporaryResult[temporaryResult.length - 1] = num;
            arr = temporaryResult;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(i != index) {
                    temporaryResult[i+x] = arr[i];
                } else {
                    temporaryResult[i] = num;
                    temporaryResult[i+1] = arr[i];
                    x++;
                }
            }
        }
        arr = temporaryResult;
    }

}
