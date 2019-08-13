class Switch_Test7 {
 public static void main(String ar[]) {
  int month=9;
  switch(month) {
  case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("이번 달은 31일");
  break;
  case 2: case 4: case 6: case 9: case 11: System.out.println("이번 달은 30일");
  }
 }
}