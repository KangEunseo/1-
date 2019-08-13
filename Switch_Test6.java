class Switch_Test6 {
 public static void main(String ar[]) {
  int a=7;
  switch(a%3) {
  case 1: case 2: System.out.println("3의 배수 아닙니다.");
  break;
  case 0: System.out.println("3의 배수");
  }
 }
}