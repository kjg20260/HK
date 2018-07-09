package chap6;

class Person{
	static String nation = "대한민국";
	String name;
	int age;
	
	void print() {
		System.out.println(nation + ":" + name + ":" + age);
	}
	static void printNation() {
		System.out.println(nation);
	}
}
public class PersonTest {
public static void main(String[] args) {
	Person p1 = new Person();
	//Integer.MAX_VALUE =4;
	p1.name= "이사원";
	p1.age = 25;
	System.out.println
	("p1객체의 이름은 "+ p1.name + " 이고 나이는 "+p1.age+" 이며 국적은 "+p1.nation + " 입니다." );
	Person p2 = new Person();
	p2.name= "박대리";
	p2.age = 35;
	System.out.println
	("p2객체의 이름은 "+ p2.name + " 이고 나이는 "+p2.age+" 이며 국적은 "+p2.nation + " 입니다." );
	p1.print();
	p2.print();
	Person.printNation();
}
}
