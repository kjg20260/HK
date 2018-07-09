package chap6;

public class Gugudan {
	void gugu() {
		System.out.println("구구단 출력 시작");
		for(int i =1; i<=9; i++) {
			for(int j = 2; j <= 9; j++) {
				if(j == 5) return;
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println("구구단 출력 종료");
	}
	//int i;
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		//i=8;
		System.out.println("메인 시작");
		g.gugu();
		System.out.println("메인 종료");		
	}

}

//public class VoidTest{
//	
//}
