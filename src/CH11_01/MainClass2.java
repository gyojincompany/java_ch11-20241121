package CH11_01;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1 = Math.abs(-10); //절대값
		System.out.println(a1); //10
		double a2 = Math.ceil(3.14); //올림->double 타입으로 반환
		System.out.println(a2); //4.0
		double a3 = Math.floor(3.14); //버림->double 타입으로 반환
		System.out.println(a3); //3.0
		double a4 = Math.round(3.14); //반올림->double 타입으로 반환
		System.out.println(a4); //3.0
		
		int a5 = (int)(Math.random() * 10)+1; //1~10
		System.out.println(a5); //0.0 <= x < 1.0  double 타입으로 반환
		int lotto = (int)(Math.random()*45)+1;
		System.out.println(lotto); //1 <= x <= 45  int 타입으로 반환
		
		
	}

}
