class For_Test3 {
 public static void main(String ar[]) {
  int sum_j=0; int sum_h=0; int i=0;
  for(i=1; i<=100; i+=2) {
              if(i%3==0) {
		        sum_h+=i;
	            System.out.println(sum_h);
	      }
	      else {
	            i=2;
	            sum_j+=i;
		        System.out.println(sum_j);
	      }
  }
 }
}