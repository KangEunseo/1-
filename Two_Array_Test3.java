class Two_Array_Test3{
	public static void main(String ar[]){
		int n[][]={  {78,48,78,98},
			            {99,92,83,29},
			            {29,64,83,89},
			            {34,78,92,56}  };
		int wid[]=new int[4], hei[]=new int[4];
		int total=0, i, j;

		for (i=0; i<n.length; i++) {
			for (j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();

		//가로 합
		for (i=0; i<n.length; i++) {
			for (j=0; j<n[i].length; j++) {
				wid[i]+=n[i][j];
			}
			System.out.println(i+1+"행 합 : "+wid[i]);
		}
		System.out.println();

		//세로 합
		for (i=0; i<n.length; i++) {
			for (j=0; j<n[i].length; j++) {
				hei[i]+=n[j][i];
			}
			System.out.println(i+1+"열 합 : "+hei[i]);
		}
		System.out.println();

		//총합
		for (i=0; i<n.length; i++) {
			for (j=0; j<n[i].length; j++) {
				total+=n[i][j];
			}
		}
		System.out.println("총합 : "+total);
	}
}