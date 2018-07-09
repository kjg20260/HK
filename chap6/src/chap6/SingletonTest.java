package chap6;


class Singleton{
	private static Singleton s1= new Singleton();
	private Singleton(){
		System.out.println("Singleton생성자호출");
	}
	
	static Singleton test() {
		if(s1 == null) {
			s1 = new Singleton();
			return s1;
		}
		else {
			//두번째
			return s1;
		}
	}
}


public class SingletonTest {
public static void main(String[] args) {
//	// 3번 생성자 호출 = 3개 생성
//	Singleton s1 = new Singleton();
//	Singleton s2 = new Singleton();
//	Singleton s3 = new Singleton();
//	// 
	 
	
	Singleton.test();
	Singleton.test();
	Singleton.test();
}
}
