package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) {                                 // 변수.equals 에서 equals 는 문자열이 동일한지 비교할 때에만 사용한다.
				break;
			}
		}
		
		System.out.println("종료");

	}

}
