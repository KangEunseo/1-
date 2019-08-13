// 4. 2단~9단 구구단 출력(while 2개)
class While_Test8 {
	public static void main(String ar[]) {

		int i=2;

		while (i<=9) {
			int j=1;
			System.out.print(i+"단 : ");
			while (j<=9)	{
				System.out.print(i+"*"+j+"="+i*j+"  ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}