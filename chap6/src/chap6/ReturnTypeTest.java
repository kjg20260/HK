package chap6;

import java.util.Arrays;

class Test{
	int add() {
		return 1+2;
	}
	boolean	equals(int i, int j){
		return i==j;
	}
	String Upper(){
		String str = "string";
		return str.toUpperCase();
	}
	String[] sort() {
		String[] str = {"java","JAVA","자바"};
		Arrays.sort(str);
		return str;
	}
	
	Employee getObject(){
		Employee e = new Employee();
		return e;
	}
}

public class ReturnTypeTest {

	public static void main(String[] args) {
		Test t1 = new Test();
		String[] str = t1.sort();
		String result3 = t1.Upper();
		System.out.println(t1.add());
		System.out.println(t1.equals(15,15));
		System.out.println(result3);
		for(int i=0; i <str.length; i++) {
			System.out.print(str[i]+" ");
		}
		Employee result5 = t1.getObject();
		result5.printInfo();		
	}

}
