package chap6;

public class Employee {
	// 여러명 회사원 객체 표현 틀 정의
	// 회사원 정적 / 동적 분석
	int id; // 사번
	String name; // 이름
	double salary; // 급여
	String dept; // 부서 이름
	
	Employee(){
		
	}
	Employee(String n){
		this.name= n;
	}
	Employee(int id, String name, double salary,String dept){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		
	}
	Employee(int id, String name, double salary){
//		this.id=id;
//		this.name=name;
//		this.salary=salary;
//		dept = "부서 미정";
		this(id, name, salary, "부서 미정");
	}
	Employee(int id, String name){
//		this.id=id;
//		this.name=name;
//		this.salary=-1;
//		dept = "부서 미정";
		this(id, name, -1, "부서 미정");
	}
	
	void printInfo() {
		System.out.println
		("이 객체의 사번은 "+id+", 이름은 "+name+", 급여는 "
		+salary+", 부서는 "+dept);
	}
}
