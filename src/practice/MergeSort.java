package practice;

public class MergeSort {
	
	static int number = 8;
	static int[] sorted = new int[8];  // 정렬 배열은 반드시 전역 변수로 선언 (필요할 때마다 배열을 생성하게 되면 불필요한 메모리사용)
	
	static void merge(int[] a, int m, int middle, int n) {
		// 시작점 m, 끝점 n, 중간점 middle
		int i = m;
		int j = middle + 1;
		int k = m;
		// 작은 순서대로 배열에 삽입
		while(i<=middle && j<=n) {
			// i는 middle까지, j는 n까지
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
			// a배열에서 i자리와 j자리의 값을 비교하여 작은 쪽을 sorted 배열의 맨 처음자리(k부터 시작)에 삽입.
		}
		// 남은 데이터도 삽입
		if(i>middle) {
			//i가 먼저 끝난 경우
			for(int t=j; t<=n; t++) {
				sorted[k] = a[t];
				k++;
			}
		}else {
			for(int t=i; t<=middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		// 정렬된 배열을 삽입 (sorted라는 배열은 정렬을 위한 배열. 이 배열을 실제 배열에 넣어야 함.)
		for(int t=m; t<=n; t++) {
			a[t] = sorted[t];
		}
	}
	
	static void mergeSort(int[] a, int m, int n) {
		// 두가지로 나뉜다는 점에서 재귀함수로 구현하는 것이 가장 좋다.
		// 크기가 1보다 큰 경우 에만 동작
		if(m<n) {
			int middle = (m + n) /2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
		
	}
	
	public static void main(String[] args) {
		// https://blog.naver.com/ndb796/221227934987
		// 평균 시간복잡도 O(N*logN)
		// 퀵정렬처럼 분할정복 방법을 채택한 알고리즘
		// 퀵정렬은 피벗값에 따라 최악의 경우 N^2의 시간복잡도를 가질 수 있음. 병합 정렬은 정확히 반벌씩 나눈다는점에서 N*logN을 보장함
		// 병합정렬 = 일단 반으로 나눈 후 나중에 합친다.
		// 병합정렬은 항상 반으로 나누기 때문에 피벗값이 없다.
		// 합칠 때는 항상 2의 배수로 합친다. (두개씩 묶어서 정렬 후 두 덩이(4개)를 묶어서 정렬. 이 단계를 반복)
		
		int[] array = new int[number];
		array = new int []{7, 6, 5, 8, 3, 5, 9, 1};
		// 자바는 c와 다르게 같은 이름으로 선언 두번 못함.
		// https://gismo99.tistory.com/entry/java-Array-constants-can-only-be-used-in-initializers
		mergeSort(array, 0, number-1);
		
		for(int i=0; i<number; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
