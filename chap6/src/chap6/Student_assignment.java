package chap6;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class Student_assignment {

	public static void main(String[] args) {
		Student student= new Student();
		student.name = args[0];
		student.dept = args[1];
		student.process = args[2];
		student.eduCost = Double.parseDouble(args[3]);
		student.addCost = Double.parseDouble(args[4]);
		System.out.println(student.process);
		if(student.process.equals("자바프로그래밍")) {
			student.refund = student.eduCost * 0.25 + student.addCost;

		}else if(student.process.equals("JDBC프로그래밍")) {
			student.refund = student.eduCost * 0.20 + student.addCost;
		}else if(student.process.equals("JSP프로그래밍")) {
			student.refund = student.eduCost * 0.15 + student.addCost;
		}
		System.out.println
		("이름 : "+student.name+" 소속 : "+student.dept+" 과정명 : "+student.process+
				" 교육비 : "+student.eduCost+" 부가금 : "+student.addCost+ " 환급금 : "+student.refund);
		
	}

}
