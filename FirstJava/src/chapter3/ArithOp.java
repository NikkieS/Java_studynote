package chapter3;

public class ArithOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		num1 = 10;
		num2 = 20;
		
		// 2. µ¡¼À ¿¬»ê -> °á°ú¸¦ Ãâ·ÂÇÏÀÚ
		int result = num1 + num2;
		System.out.println("µ¡¼À °á°ú: " + result);
		
		// 3. »¬¼À ¿¬»ê -> °á°ú¸¦ Ãâ·ÂÇÏÀÚ
		result = num2 - num1;
		System.out.println("»¬¼À °á°ú: " + result);
		
		// 4. °ö¼À ¿¬»ê -> °á°ú¸¦ Ãâ·ÂÇÏÀÚ
		result = num1 * num2;
		System.out.println("°ö¼À °á°ú: " + result);
		
		// 5. ³ª´°¼À ¿¬»ê -> °á°ú¸¦ Ãâ·ÂÇÏÀÚ
		result = num2 / num1;
		System.out.println("³ª´°¼À °á°ú: " + result);
		
		// 6. ³ª¸ÓÁö ¿¬»ê -> °á°ú¸¦ Ãâ·ÂÇÏÀÚ
		result = num1 % num2;
		System.out.println("³ª¸ÓÁö °á°ú: " + result);
		
	}

}
