package chapter4;

public class WhileContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int sum=0;
		
		while(true){
			if (sum>100) {
				break;
			}
			System.out.println(0);
			i++;
			sum += i;
		}
		
		System.out.println("������ �� : "+ i);
		System.out.println("���� 100�� �Ѿư� �� : " + sum);
	}

}
