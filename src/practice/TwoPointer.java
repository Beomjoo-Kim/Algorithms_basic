package practice;

// 투 포인터 방법 : 리스트에 순차적으로 접근해야 할 때 두 개 의 점을 이용하여
// 위치를 기록하면서 처리하는 기법

//[특정한 합을 가지는 부분 연속 수열 찾기]
// 1. 시작점 (start)과 끝점(end)이 첫 반째 원소의 인덱스(0)을 가리키도록 한다.
// 2. 현재 부분 합이 M과 같다면, 카운트한다.
// 3. 현재 부분 합이 M보다 작거나 같다면, end를 1 증가시킨다.
// 4. 현재 부분 합이 M보다 크다면, start를 1 증가시킨다.
// 5. 모든 경우를 확인할 때까지 2번부터 4번까지의 과정을 반복한다.
public class TwoPointer {
	//부분연속수열의 합 m
	static int m = 5;
	static int[] data = {1,2,3,2,5};
	static int result = 0;
	static int summary = 0;
	static int end = 0;
	
	public static void sol() {
		//start를 차례대로 증가시키며 반복
		for(int start = 0; start<data.length; start++) {
			//end를 가능한만큼 이동시키기
			while(summary<m && end<data.length) {
				summary+=data[end];
				end++;
			}
			//부분합이 m일때, 카운트 증가
			if(summary==m) result++;
			summary-=data[start];
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		sol();
	}
}
