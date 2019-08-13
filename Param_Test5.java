class Param_Test5 {
	public static void main(String ar[]) {
		System.out.println("100이하의 자연수를 입력하세요 : "+ar[0]);
		int a=Integer.parseInt(ar[0]), sum=0;

		if (a<101) {
			for (int i=1; i<=a; i++) {
		    	sum+=i;
		    }
			System.out.println("1부터 "+a+"까지의 평균 : "+sum/a);
		}

		else {
			System.out.println("100이하의 자연수가 아닙니다. 종료하겠습니다.");
		}
	}
}