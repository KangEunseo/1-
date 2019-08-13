import java.util.*;

class array_list1{
	public static void main(String ar[]){
		ArrayList<String> list=new ArrayList<String>();
				    //��generic type
		list.add("apple");
		list.add("grape");
		list.add("melon");
		list.add(null);

		//��� 1
		System.out.println(list);

		//��� 2
		for(String fruit:list){ // fruit�� ������ �Ǵ� ����. ��ü�迭 list�� �ִ� �����͵��� ������ ��.
			System.out.println(fruit);
		} // for-each ��

		//��� 3
		Iterator<String> it=list.iterator();
		while(it.hasNext()){ // ���� �����Ͱ� ������
			String s=it.next(); // �����͸� s�� �ְ�
			System.out.print(s+"\t"); // s�� ���
		}

		list.add(2, "mango"); // 2�� �ε����� mango ����(3��° ��ġ), �ڷ� �� ĭ�� �и�
		System.out.println(list);

		String s=list.get(3); // get�� �����͸� �������� ��
		System.out.println(s);

		list.remove(1); // remove�� ������ ����
		System.out.println(list);

		System.out.println(list.indexOf("mango")); // mango�� ��ġ ���
	}
}