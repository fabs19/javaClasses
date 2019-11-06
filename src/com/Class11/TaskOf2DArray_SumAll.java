package com.Class11;

public class TaskOf2DArray_SumAll {

	public static void main(String[] args) {
		//last tasks look over

		int[][] numbers = {
                { 8, 7, 5, 3 },
                { 1, 5, 6, 7 },
                { 3, 6, 8, 1 }
                };
        
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                //System.out.print(numbers[i][j] + ” “);
                
                sum=sum+numbers[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all elements in the array is= "+sum);
        
        int sum1=0;
        for(int nums[]: numbers) { //identify # array
            for(int getNum:nums) {// identify elements in each array
                sum1=sum1+getNum;
            }
        }
        System.out.println("The sum of all elements in the array is= "+sum1);
    }
	}


