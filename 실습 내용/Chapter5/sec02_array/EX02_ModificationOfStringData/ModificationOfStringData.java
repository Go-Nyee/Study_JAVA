package sec02_array.EX02_ModificationOfStringData;

public class ModificationOfStringData {

	public static void main(String[] args) {
		 
//		 String str1 = new String("안녕");//문자열 생성(문자열 클래스자료형을 이용함)
//		 System.out.println(str1); String str2 = str1;
//		  
//		 str1 = new String("안녕하세요");//new String() 생략 가능 System.out.println(str1);
//		 System.out.println(str2);
		 
		
		/*
		 * String str1 = new String("안녕"); // new하면 무조건 객체 생성 String str2 = "안녕"; // 최초
		 * 1회는 그냥 새로운 객체를 생성 String str3 = "안녕"; // 2회부터는 -원래 안녕의 값을 갖고 있던 객체의 주소를 받음
		 * String str4 = new String("안녕"); //원래 안녕의 값을 갖고 있던 객체가 있어도 새로운 객체를 만들어서 그 객체의
		 * 주소를 받아냄 // 이건 그냥 String 클래스만의 고유한 특징이고 다른 클래스들은 무조건 객체를 생성한다.
		 * 
		 * System.out.println(str1 == str2); System.out.println(str2 == str3);
		 * System.out.println(str3 == str4); System.out.println(str1 == str4);
		 */
		
		/*
		 * //문자열 + 문자열 String str1 = "안녕" + "하세요" + "!"; System.out.println(str1);
		 * 
		 * //문자열과 기본 자료형 혼용 System.out.println(1+"안녕"); System.out.println(1+"안녕"+2);
		 * System.out.println(1+"안녕"+1+2); System.out.println(1+2+"안녕");
		 */
		
		/*
		 * //문자열 검색 charAt() String str1 = "Hello Java"; String str2 = "안녕하세요 반갑습니다.";
		 * System.out.println(str1.charAt(1)); System.out.println(str2.charAt(1));
		 * System.out.println();
		 * 
		 * //indexOf(), lastIndex() System.out.println(str1.indexOf('a'));
		 * System.out.println(str1.lastIndexOf('a'));
		 * 
		 * //valueOf() : 기본 자료형의 값을 문자열로 변환 시켜줌. String str3 = String.valueOf(2.3);
		 * String str4 = String.valueOf(false); System.out.println(str3);
		 * System.out.println(str4);
		 */
		
		//문자열의 내용 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str2 == str4);
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4)); // 대소문자 구분함.
		System.out.println(str4.equalsIgnoreCase(str3)); //대소문자 구분 안함.
	}

}
