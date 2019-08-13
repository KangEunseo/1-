// 3. 알파벳 대문자를 소문자로 변환 (아스키코드 대문자 A에서 32더하면 소문자 a)
class While_Test7 {
	public static void main(String ar[]) {
		int A=65;
		int a=97;

		System.out.println("1) 대문자 → 소문자");
		while(A<=90) {
			int result = A+32;
			System.out.print((char)result);
			A++;
		}
	}
}