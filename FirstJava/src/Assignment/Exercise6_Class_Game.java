package Assignment;

public class Exercise6_Class_Game {
	/*
	 * 문제2. 다음조건을 만족하는 클래스를 구성하자. 구슬치기와 딱지치기 어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다. 놀이를
	 * 통한 구슬을 주고받음을 표현하는 메서드가 존재한다. 두 번째 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의미하는
	 * 것이다. 조건을 만족하는 클래스를 정의하였다면, 다음조건을 만족하는 인스턴스를 각각 생성하자. ( 하나의 클래스만 작성하자 ) 어린이 1의
	 * 보유자산  구슬 15개 어린이 2의 보유자산  구슬 9개 인스턴스의 생성이 완료되면 다음의 상황을 main 메서드 내에서 시뮬레이션
	 * 하자. “1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다” “2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.”
	 * 마지막으로 각각의 어린이의 보유 구슬의 개수를 출력하고 프로그램 종료.
	 */
	// 소유하고 있는 구슬의 정보 변수
	int marbles;
	
	// 소유하는 구슬의 잃고 얻음 표현 매소드
	void setMarble(int num) {
		marbles = num;
	}
	
	void gameWin(Exercise6_Class_Game boy, int num) {
		marbles += num;
		boy.marbles -= num;
	}
	
	void showData() {
		System.out.println("현재 보유하고있는 구슬의 개수 : "+marbles+"개 입니다.");
	}
	public static void main(String[] args) {
		// 어린이 1 인스턴스 생성
		Exercise6_Class_Game child1 = new Exercise6_Class_Game();
		// 어린이 2 인스턴스 생성
		Exercise6_Class_Game child2 = new Exercise6_Class_Game();
		
		child1.setMarble(15);
		child2.setMarble(9);
		System.out.println("어린이1이 보유한 구슬의 개수: "+child1.marbles);
		System.out.println("어린이2가 보유한 구슬의 개수: "+child2.marbles);
		System.out.println("-------------------------------------");
		
		// 1차 게임
		System.out.println("1차 게임에서 어린이1은 어린이2의 구슬 2개를 획득한다.");
		child1.gameWin(child2, 2);
		
		// 2차 게임
		System.out.println("2차 게임에서 어린이2은 어린이1의 구슬 7개를 획득한다.");
		child2.gameWin(child1, 7);
		System.out.println("-------------------------------------");
		
		// 게임 결과 출력
		System.out.println("어린이1가 보유한 구슬의 개수: "+child1.marbles);
		System.out.println("어린이2가 보유한 구슬의 개수: "+child2.marbles);
	}
}
