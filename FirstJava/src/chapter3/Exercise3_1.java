package chapter3;

public class Exercise3_1 {

	public static void main(String[] args) {
		
		// 1. ���� ������ ����� �����ÿ�
		int x = 2;

		int y = 5;

		char c = 'A'; // 'A'�ǹ����ڵ�� 65

		System.out.println(y+= 10 - x++); // ���: 13, y = 15 -> 15-2=13 -> x= 3
		System.out.println(x+=2); // ���: 5, x=5
		System.out.println(!('A' <= c && c <='Z') ); // ���: false, (65 <= 65 && 65 <= 90) = true, !(true) = false
		System.out.println('C'-c); // ���: 2, 'C' = 67, 67-65 =2
		System.out.println('5'-'0'); // ���: 5, '5' = 53 '0' = 48, 53-48=5
		System.out.println(c+1); // ���: 66, c = 65
		System.out.println(++c); // ���: 'B', c = 66
		System.out.println(c++); // ���: 'B', c = 67
		System.out.println(c); // ���: 'C', 67
		
		
		// 2. �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�.���� ����Ǽ��� 123���̰� �ϳ��� �ٱ��Ͽ���10���� ����� ���� �� �ִٸ�,13���� �ٱ��ϰ� �ʿ��� ���̴�.(1)�� �˸��� �ڵ带 �����ÿ�.
		//3�� ������ : ������ Ǯ� �˴ϴ�.
		int numOfApples =123; // ����� ����

		int sizeOfBucket =10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)

		int numOfBucket = ( (numOfApples % sizeOfBucket) != 0 ) ? (numOfApples / sizeOfBucket + 1) : (numOfApples / sizeOfBucket); // ��� �������µ� �ʿ��� �ٱ����� ��

		System.out.println("�ʿ��ѹٱ����� �� :"+numOfBucket);
		
		
		// 3. �Ʒ��� ����num�� ���� ���� �������,��������,��0���� ����ϴ� �ڵ��̴�.���� �����ڸ� �̿��ؼ�(1)�� �˸��� �ڵ带 �����ÿ�.
		// [Hint] ���� �����ڸ� �� �� ����϶�.
		// 3�� ������ : ������ Ǯ� �˴ϴ�.
		int num = 10;

		System.out.println(((num > 0) ? ("���"):((num == 0) ? ("0"):("����"))));
		
		// 4. �Ʒ��� ����num1�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�.���� ���� num1 �� ���̡�456���̶�� ��400���� �ǰ�,��111���̶�� ��100���� �ȴ�.(1)�� �˸��� �ڵ带 �����ÿ�
		int num1 = 456;

		System.out.println((num1 / 100) * 100);
		
		// 5. �Ʒ��� ����num2�� �� �߿��� ���� �ڸ���1�� �ٲٴ� �ڵ��̴�.���� ���� num2�ǰ��� 333�̶�� 331�� �ǰ�,777�̶�� 771�� �ȴ�.(1)�� �˸��� �ڵ带 �����ÿ�.
		int num2 = 333;

		System.out.println((num2/10)*10+1);
		
		// 6. �Ʒ��� ����num3�� ������ ũ�鼭�� ���� �����10�� ������� ����num3�� ������ �������� ���ϴ� �ڵ��̴�.���� ���, 24�� ũ�鼭�� ���� �����10�� ����� 30�̴�.19�� ��� 20�̰�,81�� ��� 90�� �ȴ�.30���� 24�� �� ��������6�̱� ������ ����num3�� ���� 24���6������� ���� �Ѵ�.(1)�� �˸��� �ڵ带 �����ÿ�.
		// [Hint] ������ �����ڸ� ����϶�.
		int num3 = 24;

		System.out.println(((num3/10)*10+10) % num3);
		
		// 7. �Ʒ��� ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�.��ȯ������ 'C =5/9 ��(F - 32)'��� �� ��,(1)�� �˸��� �ڵ带 �����ÿ�.��, ��ȯ ������� �Ҽ�����° �ڸ����� �ݿø��ؾ� �Ѵ�.
		// (Math.round()�� ������� �ʰ� ó���� ��)
		int fahrenheit =100;

		//float celcius = ( (int)(((5.0f/9.0f) * (fahrenheit - 32))*1000) / 1000f ); // 37.777
		float celcius = (((((5.0f/9.0f) * (fahrenheit - 32)*100) % 10)>=5) ? (((int)(((5.0f/9.0f) * (fahrenheit - 32))*100) / 100f) + 0.01f) : ((int)(((5.0f/9.0f) * (fahrenheit - 32))*100) / 100f));
		float celcius2 = (int)(5/9f * (fahrenheit - 32) * 100 + 0.5) / 100f;
		System.out.println("Fahrenheit:"+fahrenheit);
		
		System.out.println("Celcius:"+celcius);
		
		// 8. �Ʒ� �ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.
//		byte a = 10;
//
//		byte b = 20;
//
//		byte c = a + b;   
//
//		char ch = 'A';
//
//		ch = ch + 2;     
//
//		float f = 3 / 2;    
//
//		long l = 3000 * 3000 * 3000;    
//
//		float f2 = 0.1f;
//
//		double d = 0.1;
//
//		boolean result = d==f2;    
//
//		System.out.println("c="+c);
//
//		System.out.println("ch="+ch);
//
//		System.out.println("f="+f);
//
//		System.out.println("l="+l);
//
//		System.out.println("result="+result);
	

	}

}
