package sec01_array.EX03_InitialValue;

import java.util.Arrays;

public class InitialValue {

	public static void main(String[] args) {
		// 스택 메모리값(강제 초기화 되지 않음
		//int value1; //초기화 안 됨
		//System.out.println(value1); 초기화가 되어있지 않아서 오류가 남
		//int[] value2; //초기화 안 됨
		//System.out.println(value2); 초기화과 되어있지 않아서 오류가 남

		boolean[] array1 = new boolean[3]; // 힙영역에 3칸짜리 객체가 생김, 자동으로 초기화가 됨(false로)
		for(int i=1;i<3;i++)
		{
		    System.out.print(array1[i] + " "); // 출력 false, false, false
		}
		System.out.println();
		int[] array2 = new int[3]; // 힙영역에 3칸짜리 객체가 생김, 자동으로 초기화가 됨(0으로)
		for(int i=1;i<3;i++)
		{
		    System.out.print(array2[i] + " ");  // 출력 0, 0, 0
		}
		System.out.println();
		double[] array3 = new double[3]; // 힙영역에 3칸짜리 객체가 생김, 자동으로 초기화가 됨(0.0으로)
		for(int i=1;i<3;i++)
		{
		    System.out.print(array3[i] + " ");  // 출력 0.0, 0.0, .0.0
		}
		System.out.println();
		String[] array4 = new String[3]; // 힙영역에 3칸짜리 객체가 생김, 자동으로 초기화가 됨(null로)
		for(int i=1;i<3;i++)
		{
		    System.out.print(array4[i] + " ");  // 출력 null, null, null
		}
		System.out.println();

		//boolean, int, double은 기본 자료형이고(값)
		//String은 참조자료형이다. (주소) 만약 주소를 초기화 시키지 않았다면 null이 담긴다.

		//배열을 한 번에 출력하는 방법
		System.out.println(Arrays.toString(array1)); // 출력 [false, false, false]
		System.out.println(Arrays.toString(array2)); // 출력 [0, 0, 0]
		System.out.println(Arrays.toString(array3)); // 출력 [0.0, 0.0, .0.0]
		System.out.println(Arrays.toString(array4)); // 출력 [null, null, null]

		//배열을 for문으로 출력하는 가장 멋진방법(enhanced for문, for-each문) //처음부터 끝까지 출력할때 사용
		for(boolean k: array1)
		{
		    System.out.println(k); //출력 false false false
		}
		for(int k: array2)
		{
		    System.out.println(k); //출력 0 0 0
		}
		for(double k: array3)
		{
		    System.out.println(k); //출력 0.0 0.0 0.0
		}
		for(String k: array4)
		{
		    System.out.println(k); //출력 null null null
		}
		//k는 그냥 변수명

	}

}
