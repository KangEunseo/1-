import java.util.*;

class J1401{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		String sub[]=new String[5];
		int num[]=new int[5], i, all=0, arr=0, maj=0, min=0;
		String search;

		System.out.println("5개의 과목명을 입력하세요 >> :");
		for (i=0; i<sub.length; i++) {
			sub[i]=sc.next();
		}

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		System.out.println("5개의 점수를 입력하세요 >> :");
		for (i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			all+=num[i];
		}
		arr=all/5;
		maj=num[0];
		min=num[0];

		for (i=0; i<num.length; i++) {
			if (num[i]>maj)	{
			    maj=num[i];
			}
		    else if (num[i]<min)	{
		        min=num[i];
	     	} 
		}

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		System.out.println("과목 총점 >> "+all);
		System.out.println("과목 평균 >> "+arr);
		System.out.println("최고 점수 >> "+maj);
		System.out.println("최저 점수 >> "+min);

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		while (true) {
			System.out.print("검색할 과목명을 입력하세요 : ");
			search=sc.next();
			if (search.equals(sub[0])) {
				System.out.println(sub[0]+"의 점수 : "+num[0]);
			}
			else if (search.equals(sub[1])) {
				System.out.println(sub[1]+"의 점수 : "+num[1]);
			}
			else if (search.equals(sub[2])) {
				System.out.println(sub[2]+"의 점수 : "+num[2]);
			}
			else if (search.equals(sub[3])) {
				System.out.println(sub[3]+"의 점수 : "+num[3]);
			}
			else if (search.equals(sub[4])) {
				System.out.println(sub[4]+"의 점수 : "+num[4]);
			}
			else if (search.equals("그만")) {
				break;
			}
		}
	}
}