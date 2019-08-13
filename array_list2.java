import java.util.*;

class array_list2{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i, sc.nextInt());
		}
		System.out.println();
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		int max=list.get(0);
		for(int i=1;i<list.size();i++){
			if (max<list.get(i)){
				max=list.get(i);
			}
		}
		System.out.println("�ִ밪 : "+max);
	}
}