package sec01_array.EX04_primaryAndreferencetype;

public class primaryAndreferencetype {

	public static void main(String[] args) {
		//기본 자료형의 대입연산

		int value1 = 3; //value1의 전용공간의 스택 영역에 있어서 value1의 값이 바뀌지 않음
		int value2 = value1; // 3으로 초기화, value2의 공간이 새로 생김
		value2 = 7;
		System.out.println(value1); //3출력
		System.out.println(value2); //7출력
		System.out.println();

		//참조 자료형의 대입연산
		int[] array1 = new int[] {3, 4, 5}; //new를 하면 힙영역에 객체를 따로 생성하는데 araay1의 전용 공간만 생성해서 array2의 전용 공간이 없기 때문에 array2 = array1이라고 대입 했을때 77이 출력됨.
		int[] array2 = array1; // 참조 변수에는 주소가 담기니까 array1의 주소를 담음
		array2[0] = 7;
		System.out.println(array1[0]); // 7출력
		System.out.println(array2[0]); // 7출력

	}

	//배열을 출력하기 위해 for문을 사용할때 조건문에 배열의 크기 자체를 적는 것은 가독성이 떨어지기 때문에 변수명.length를 넣는 것이 좋다

}
