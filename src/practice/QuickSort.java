package practice;

public class QuickSort {
	static int[] input = {1, 10, 5, 8, 7, 6, 4, 3, 2 ,9};
	static int number = 10;
	
	static void show() {
		for(int i=0; i<number; i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	
	static void quickSort(int[] input, int start, int end) {
		if(start>=end) { //원소가 1개인 경우
			return;
		}
		int key = start; //키는  첫번째 원소
		int i = start+1; //키값 바로 다음부터 시작하는 인덱스
		int j = end; // 왼쪽으로 가는 출발지점 인덱스
		int temp; //두가지 값 위치 바꾸기위한 임시변수
		
		while(i<=j) { //엇갈릴 때까지 반복 (엇갈리면 while 탈출)
			while(i<=end && input[i] <= input[key]) {
				i++; //키 값보다 큰값을 만날때까지 반복

			}
			while(input[j]>=input[key]&&j>start) {  
				//키값보다 작은값을 만날때까지 반복 + j 범위 제한. 
				//(엇갈릴 경우 왼쪽값과 키값을 교체하기때문에 오른쪽은 설정할필요없음)  
				j--;
			}
			if(i>j) {
				temp = input[j];
				input[j] = input[key];
				input[key] = temp;
			}else {
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				
			}
		}
		
		quickSort(input, start, j-1); //i-1은 되는 이유?
		quickSort(input, j+1, end);  //i+1은 안되는이유 ?
	}

	
	public static void main(String[] args) {  //퀵 정렬 : 대표적은 분할정복 알고리즘. 평균속도 N*logN

		quickSort(input, 0, number-1);
		show();

	}

}
