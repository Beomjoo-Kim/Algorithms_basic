package practice;

public class SelectionSort {  //선택정렬 = 가장 작은것을 선택하여 맨 앞으로

	public static void main(String[] args) {
		int[] input = {1, 10, 5, 8, 7, 6, 4, 3, 2 ,9};
		int temp=0;
		int index=0;
		for (int i=0; i<input.length; i++) {
			int min=9999;
			for(int j=i; j<input.length; j++) {
				if(input[j]<min) {
					min = input[j];
					index = j;
				}
			}
			temp = input[i];
			input[i]=input[index];
			input[index]=temp;			
		}
		
//		for(int i=0; i < input.length; i++){   //이근성코드
//		    index = i;
//		    for(int j=i+1; j < input.length; j++){
//		        if(input[j] < input[index]) index = j;
//		    }
//		    temp = input[index];
//		    input[index] = input[i];
//		    input[i] = temp;
//		}  
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		
	}

}
