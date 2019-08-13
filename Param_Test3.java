class Param_Test3 {
	public static void main(String ar[]) {
		System.out.println("100 이하의 정수를 두 개 입력하세요 >> "+ar[0]+", "+ar[1]);

		int a1=Integer.parseInt(ar[0]), a2=Integer.parseInt(ar[1]);
		
		if (a1<101 && a2<101) {
			for (int i=a1; i<=a2; i++) {
		    	System.out.println(i);
		    }
		}
		else {
			System.out.println("100 이하의 정수가 아니에요. 종료하겠습니다.");
		}
	}
}