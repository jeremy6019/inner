package interface0910;

public class Main {
    // Main클래스 안에서 String 클래스가 사용됨 -has a 
	// 이경우는 인스턴스 변수로 선언되서 Main과 수명이 같아서 composition 
	String str; 
	public static void main(String[] args) {
		String str; // aggregation 
		
		// ServiceImp객체를 생성 
	   // ServiceImp service = new ServiceImp();
		
	    // 인터페이스를 implements한 클래스의 객체를 만들 때는 
	    // 변수를 만들 때  인터페이스 이름을 사용하기도 합니다. 
	    Service service = new ServiceImp();
	    service.insert();
	    service.read();
	    service.update();
	    service.remove();
	    
	}

}
