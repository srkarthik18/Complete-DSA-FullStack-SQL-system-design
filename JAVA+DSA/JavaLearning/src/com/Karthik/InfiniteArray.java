package com.Karthik;

//position of an element in the infinite sorted array

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 56, 67, 78, 89, 90, 101, 123, 234, 345, 456, 567};
        int target = 101;
        System.out.println(findingAnswer(arr, target));
    }

    static int findingAnswer(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num && num != nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
