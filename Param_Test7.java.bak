class Param_Test7 {
	public static void main(String ar[]) {
		System.out.println("두 개의 정수를 입력하세요 : "+ar[0]+", "+ar[1]);
		int a1=Integer.parseInt(ar[0]), a2=Integer.parseInt(ar[1]);
		int sum=0, aver=0, count=0;

		for (int i=a1; i<=a2; i++) {
			if (i%3==0 || i%5==0) {
				sum+=i;
				count++;
			}
		}
		aver=sum/count;

		System.out.println(a1+"에서 "+a2+"까지 수 중에 3이나 5의 배수인 수들의 합 : "+sum);
		System.out.println(a1+"에서 "+a2+"까지 수 중에 3이나 5의 배수인 수들의 평균 : "+aver);
	}
}