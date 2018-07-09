package project.member;


// 다른 패키지로 개방

public class MemberDAO {
	private String loginid="scott";
	public void login() {
		System.out.println("사용자가 로그인하였습니다.");
	}
	
	public void logout() {
		System.out.println("사용자가 로그아웃하였습니다.");
	}
}
