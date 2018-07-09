package project.board; //클래스 저장 폴더 설정

import java.util.*;
import project.member.MemberDAO; //클래스의 패키지 알려줌

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		MemberDAO dao2 = new MemberDAO();
		dao2.login();
		BoardDAO dao = new BoardDAO();
		dao.writeBoard();
		dao.viewBoard();
		dao2.logout();
	}

}
