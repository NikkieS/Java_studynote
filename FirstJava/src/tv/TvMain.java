package tv;

public class TvMain {

	public static void main(String[] args) {
		// Tv 인스턴스 생성
		Tv tv = new Tv();
		
		System.out.println("---------------------------");
		System.out.println("Tv의 속성값");
		System.out.println("Tv의 color : "+tv.color);	// default : null
		System.out.println("Tv의 power : "+tv.power);	// default : false
		System.out.println("Tv의 channel : "+tv.channel);// default : 0

	}

}
