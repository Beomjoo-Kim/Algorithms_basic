package practice;

public class InsertionSort {  //삽입정렬은 필요할 때만 위치를 변경. 거의 정렬된 상태에서는 어느 정렬보다 빠르다.

	public static void main(String[] args) {
		int[] input = {1, 10, 5, 8, 7, 6, 4, 3, 2 ,9};
		int temp;
		for(int i=0; i<input.length-1; i++) {
			int j=i;
			while(input[j]>input[j+1]) {   //바로 앞의 것과 비교하면서 바로앞이 자신보다 작을때까지 변환
				temp = input[j];
				input[j] = input[j+1];
				input[j+1] = temp;
				j--;
			}
		}
		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
	}

}
