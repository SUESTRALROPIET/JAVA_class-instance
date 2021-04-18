public class LoopApp {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		System.out.println("===while===");
		int i = 0;
		//while(bollean datatype)
		//while(true) {
		while(i<3) {
			System.out.println(2);
			System.out.println(3);
			//i = i + 1;
			i++;
		}
		
		System.out.println("===for===");
		//for(초기값; Boolean datatype(조건); 실행코드)
		for(int j=0; j<3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		//Unreachable code
		System.out.println(4);
	}
}
//while보다 for문이 한 줄에 표현되므로 오류가 적다.