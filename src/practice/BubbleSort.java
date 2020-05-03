package practice;

public class BubbleSort {   //버블정렬 = 바로 옆에 있는것과 비교

	public static void main(String[] args) {
		int[] input = {1, 10, 5, 8, 7, 6, 4, 3, 2 ,9};
		int temp;
		for(int i=0; i<input.length; i++) {
			for(int j=0; j<input.length-1-i;j++) {   //뒤에서 하나씩 확정해가며 정렬
				if(input[j]>input[j+1]) {
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}

}
