package chap6;

class Adder{
	int add(int i, int j){
		return i+j;
	}
	
	double add(double i, double j){
		return i+j;
	}
	String add(String i, String j){
		return i+j;
	}
}



public class OverloadingTest {

	public static void main(String[] args) {
		Adder a1 = new Adder();
		System.out.println(a1.add("가고 ", "싶다"));
		System.out.println(a1.add(43, 39));
		System.out.println(a1.add(25.91, 56.91));
		// String -> int 변환
		int dec=Integer.parseInt("82");
		int bin=Integer.parseInt("1010010",2);
		int hex=Integer.parseInt("52",16);
		System.out.print(dec+" ");
		System.out.print(bin+" ");
		System.out.print(hex+" ");
	}

}
