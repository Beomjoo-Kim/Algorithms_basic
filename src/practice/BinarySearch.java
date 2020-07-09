package practice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int left = 0;
		int right = array.length-1;
		int target = sc.nextInt();
		
		while(left <= right) {
			int mid = (left+right)/2;
			if(array[mid]>target) {
				right = mid-1;
			}else if(array[mid]<target) {
				left = mid+1;
			}else {
				System.out.println(mid);
				break;
			}
		}
		
		sc.close();
		
	}
}
