package chapter4;

public class ByTimes2 {

	public static void main(String[] args) {
		// ������
		// �� * 1~9= ��� : 2*1=2
	
		int i=2;
		while(i<10) {
			System.out.println(i+"��");
			System.out.println("----------");
			
			int j=1;
			while(j<10) {
				System.out.println(i+" x "+j+" = "+i*j);
				j++;
			}
			System.out.println("----------");
			
			i++;
		}
	}

}
