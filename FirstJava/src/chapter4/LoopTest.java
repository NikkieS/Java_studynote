package chapter4;

public class LoopTest {

	public static void main(String[] args) {
		// 5�� ���
		System.out.println(5);
		System.out.println(4);
		System.out.println(3);
		System.out.println(2);
		System.out.println(1);
		
		
		//for��
		System.out.println("--------for��--------");
		for (int i=5; i>=1; i--) {
			System.out.println(i);
		}
		
		//while��
		System.out.println("-------while��-------");
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		//do-while��
		System.out.println("------dowhile��------");
		int j=0;
		do {
			j++;
			System.out.println(j);
		} 
		while(j<5);
	}

}
