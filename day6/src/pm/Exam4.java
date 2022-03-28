package pm;

public class Exam4 {

	public static void main(String[] args) {
		// 객체의 생성과 활용
/* 객체 생성
   클래스명 개체명 = new 생성자();	
*/
	A a = new A();
	a.m = 5;
	System.out.println(a.m);
	
	a.print();
	}
}
class A {      //클래스 A에는 
	int m = 3;       // 필드가 1개 있다. 필드값은 3으로 초기화 되어 있다. 
	void print() {   // print() 매서드 한개와
		int k = 5; // 지역 변수
		System.out.println("객체 생성");
	}
}


/* 필드 field : 클래스에 포함된 변수, 객체의 속성값을 지정할 수 있다. 
 * 필드는 지역변수와는 다르다. 지역변수는 '메서드에 포함된 변수'
 * 즉 필드와 지역변수는 구분해야 한다. 클래스의 중괄호 내에 선언된 변수는 '필드'
 * 메서드의 중괄호 안에 선언된 변수는 '지역 변수' 라고 생각하면 된다. 
 * 필드와 지역변수의 또다른 차이점은 초기값이다. 필드는 직접 초기화 하지 않아도
 * 강제로 초기화된다. 반면, 지역 변수는 직접 초기화 하지 않으면 저장 공간이 그대로 있어서
 * 그냥 출력하면 오류가 발생한다. 

 */
