class Solution {
    static int findMax(int[] a, int x){
        int max = 0;
        for(int i = x; i < a.length; i++){
            max = Math.max(a[i], max);
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++ ){
            arr[i] = findMax(arr, i + 1);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}