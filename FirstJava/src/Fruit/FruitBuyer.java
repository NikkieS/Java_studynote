package Fruit;

public class FruitBuyer {
	// 속성: 변수
	// 보유한 나의 돈
	// 사과의 개수
	int myMoney = 10000;
	int numOfApple = 0;
	
	// 구매 기능 : 매소드
	// 1. seller 받기
	// 2. 지출할 돈 정의
	// 3. seller에게 돈을 주고 판매 요청 -> 사과의 개수
	// 4. 사과의 개수를 받은 사과의 개수만큼 증가시킨다.
	// 5. 지출한 돈은 나의 돈에서 차감한다.
	// 6. 반환할 값이 없으니 void
	
	// 참조변수: 해당 클래스로 만들어진 객체의 주소값을 저장하는 변수이다
	void buyApple(FruitSeller seller, int money) {
		// 구매한 사과의 개수
		int num = seller.saleApple(money);
		
		numOfApple += num;
		myMoney -= money;
	}
}
