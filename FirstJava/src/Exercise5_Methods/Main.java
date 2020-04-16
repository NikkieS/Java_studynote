package Exercise5_Methods;

public class Main {
	public static void main(String[] args) {
		//문제1. 두 개의 정수를 전달받아서, 두수의 사칙연산 결과를 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해보자.
		//단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
		
		//4칙연산 생성: 객체 인스턴스 화
		System.out.println("------------1번 문제------------");
		Arithmetic arithMethod = new Arithmetic();
		
		arithMethod.arith(20, 30);
		//문제2. 두 개의 정수를 전달 받아서, 두수의 절대값을 계산하여 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해 보자. 
		//단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.
		System.out.println("------------2번 문제------------");
		Absolute res = new Absolute();
		
		res.abs(-15, 20);
		
		//문제3. 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 이를 호출하는 main메서드를 정의하자.
		//(2*π*r), (π*r∧2)
		System.out.println("------------3번 문제------------");
		AreaOfCircle areaOfCircle = new AreaOfCircle();
		CircumferenceOfCircle circumOfCircle = new CircumferenceOfCircle();
		
		double area = areaOfCircle.area(3);
		double circum = circumOfCircle.circum(3);
		
		System.out.println("원의 넓이: "+area);
		System.out.println("원의 둘레: "+circum);
		
		//문제4. 전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
		System.out.println("------------4번 문제------------");
		
		PrimeNumber numP = new PrimeNumber();
		
		for(int num=1; num<=100; num++) {
			if (numP.prime(num)==true) {
				System.out.println(num+"은 소수 입니다.");
			}
		}
	}
}
