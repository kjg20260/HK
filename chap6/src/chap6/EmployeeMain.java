package chap6;

//클래스 = 객체틀 정의
// Employee = 회사원틀
// EmployeeMain = 객체 생성 실행, 메모리 저장
public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "홍길동",500000, "교육부"); 
//		e1.id = 100;
//		e1.dept = "교육부";
//		e1.salary = 500000;
		Employee e2 = new Employee(200,"유관순");//200, "유관순", 650000, "인사부");
//		e2.id = 200;
//		e2.name = "유관순";
//		e2.dept = "인사부";
//		e2.salary = 650000;
		
//		System.out.println
//		("e1 객체의 사번은 "+e1.id+", 이름은 "+e1.name+", 급여는 "
//		+e1.salary+", 부서는 "+e1.dept);
//		System.out.println
//		("e2 객체의 사번은 "+e2.id+", 이름은 "+e2.name+", 급여는 "
//		+e2.salary+", 부서는 "+e2.dept);
		e1.printInfo();
		e2.printInfo();
	}

}
