//1부터 값을 더해나갈때 합이 100을 넘게하는 숫자 출력

class While_Test11 {
	public static void main(String ar[]) {
		int i=1, sum=0;
		while (true) {
			sum+=i;
			i++;
			if (sum>=100) {
				break;
			}
		}
		System.out.println(i);
	}
}