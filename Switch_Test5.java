import java.util.Calendar ;
class Switch_Test5 {
 public static void main(String ar[]) {

//���� �� ���ϴ� Ŭ����
 int month=Calendar.getInstance().get(Calendar.MONTH)+1;
 System.out.println(month);
 String season="";
 switch(month) {
  case 1:
  case 2:
  case 12: season="�ܿ�";
  break;
  case 6:
  case 7:
  case 8: season="����";
  break;
  case 3:
  case 4:
  case 5: season="��";
  break;
  case 9:
  case 10:
  case 11: season="����";
 }
 System.out.println(season);
}
}