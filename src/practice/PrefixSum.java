package practice;
// Prefix Sum -> 접두사 합

// [구간 합 빠르게 계산하기]
// 1. Prefix Sum을 계산하여 배열 P에 저장한다.
// 2. 매 M개의 쿼리 정보를 확인할 때, 구간 합은 P[R]-P[L-1]이다.


// Prefix Sum = 누적 합

// ex) [10, 20, 30, 40, 50]
// => [0, 10, 30, 60, 100, 150]
// 1) L=1, R=3 => P[3]-P[0] = 60
// 2) L=2, R=5 => P[5]-P[1] = 140
public class PrefixSum {
	static int[] data = {10, 20, 30, 40, 50};
	static int[] prefixSum = new int[data.length+1];
	
	public static void getPrefixSum() {
		int sum = 0;
		for(int i = 0; i<prefixSum.length; i++) {
			prefixSum[i]=sum;
			if(i<data.length)sum+=data[i];
		}
	}
	
	public static void sol() {
		int left = 3, right = 4;
		System.out.println(prefixSum[right]-prefixSum[left-1]);
	}
	
	public static void main(String[] args) {
		getPrefixSum();
		sol();
		
	}
}
