package chap6;

class B{
	int k = 10;
}
class A{
	void add(int i) {
		System.out.println(i++);
		getTotal(i);
	}
	void addB(B b1) {
		System.out.println(b1.k++);
	}
	void getTotal(int ... i) {
		System.out.println("입력 개수 = "+i.length);
		int total=0;
		for(int j:i) {
			total+=j;
		}
		System.out.println("총합 = "+total);
	}
}

public class CallByvalueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1= new A();
		B b2 = new B();
		a1.addB(b2);
		a1.getTotal(4,5,6,77,45);
		a1.getTotal(2,4,5,6,77,45);
		a1.getTotal(23,412,24,5,6,77,45);
		a1.getTotal(4,5,62,123,77,45);
		int j= 10;
		a1.add(j);
		System.out.println("a1.addB(b2)메소드 호출 후의 b2.k = "+b2.k);
		
	}

}
