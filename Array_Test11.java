class Array_Test11{
	public static void main(String ar[]){
		int n[]=new int[900];
		int count=0, sum=0;

		for (int i=0; i<n.length; i++) {
			n[i]=i+100;
			if (n[i]%4!=0) {
				count+=1;
				sum+=n[i];
			}
		}

		System.out.println("100���� 999���� �� �� 4�� ����� �ƴ� ���� ���� : "+count+"(��)");
		System.out.println("100���� 999���� �� �� 4�� ����� �ƴ� ���� �� : "+sum);
	}
}