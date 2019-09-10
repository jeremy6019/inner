package polymorp1;

public class Civilconflict {

	public static void main(String[] args) {

		// 현재Civil 클래스가 abstract클래스 아님 
		// abstract class 가 아니어서 객체 생성이 가능 	
		// Civil 클래스의  class앞에 abstract를 추가하면 에러 
		Civil man = new Rome();	
//		Civil cvm = new Civil();	
		man.attack();
		
		// Rome클래스의 인스턴스 생성
		Rome roman = new Rome();
		roman.attack();
		
		// Mongol클래스의 인스턴스 생성 
		Mongol mon = new Mongol();
		man = new Mongol();
		man.attack();
		
		// Persia클래스의 인스턴스 생성 
	    Persia per = new Persia();
	    man = new Persia();
		man.attack();

	   
		
		
		
		
	}

}
