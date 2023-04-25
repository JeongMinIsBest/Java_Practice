package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
	
		long var1 = 10;
		long var2 = 20L;
		
		//long var3 = 1000000000000; <- 컴파일 에러 발생, long 타입임을 컴파일러에게 알려주지 않았기 때문
		long var4 = 10000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		char var5 = 'A';
		int var6 = 'A';
		
		System.out.println(var5); //A를 출력
		System.out.println(var6); //65를 출력
		
		System.out.println("\"Hello Wolrd\"");

	}

}
