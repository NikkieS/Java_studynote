package chapter4;

public class IEBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("true 일때 출력");
		}
		if(false) {
			System.out.println("false 일때 출력");
		}
		else {
			System.out.println("else 일때 출력");
		}
		
		// 홀수 짝수 판별
		int num = 10;
		
		if(num > 0)
			System.out.println("num은 0보다 크다.");
		if((num % 2) == 0)
			System.out.println("num은 짝수");
		else
			System.out.println("num은 홀수");
	}

}
