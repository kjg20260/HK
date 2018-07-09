package chap6;

public class CellPhone {
	String model;	// 핸드폰 모델 번호
	double battery;	// 남은 배터리 양
	
	
	CellPhone(String model){
		this.model = model;
	}
	
	void call(int time) throws IllegalArgumentException{
		
//		if(time < 0) {
//			
//			System.out.println("통화시간입력오류");
//			return;
//		}
		try {
			if(time<0) {
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			System.out.println("통화시간입력오류");
			throw e;
		}
		System.out.println("통화 시간 = " +time);
		this.battery -= time*0.5;
		if(this.battery<0) {
			this.battery=0;
			System.out.println("핸드폰이 종료되었습니다.");
		}
	}
	
	void  charge(int time) {
		if(time < 0) {
			System.out.println("충전시간입력오류");
			return;
		}
		System.out.println("충전 시간 = " +time);
		this.battery += time*3;
		
		if(this.battery>100) {
			this.battery = 100;
			System.out.println("핸드폰 충전 100%입니다.");
		}
	}
	
	void printBattery() {
		System.out.println("남은 배터리 양 = " +this.battery);
	}
	
	boolean  isSame(CellPhone other) {
		return this.model.toUpperCase().equals(other.model.toUpperCase());
	}
}
