import java.util.*;

class array_list1{
	public static void main(String ar[]){
		ArrayList<String> list=new ArrayList<String>();
				    //↑generic type
		list.add("apple");
		list.add("grape");
		list.add("melon");
		list.add(null);

		//출력 1
		System.out.println(list);

		//출력 2
		for(String fruit:list){ // fruit은 변수가 되는 것임. 객체배열 list에 있는 데이터들이 변수로 들어감.
			System.out.println(fruit);
		} // for-each 문

		//출력 3
		Iterator<String> it=list.iterator();
		while(it.hasNext()){ // 다음 데이터가 있으면
			String s=it.next(); // 데이터를 s에 넣고
			System.out.print(s+"\t"); // s를 출력
		}

		list.add(2, "mango"); // 2번 인덱스에 mango 삽입(3번째 위치), 뒤로 한 칸씩 밀림
		System.out.println(list);

		String s=list.get(3); // get은 데이터를 꺼내오는 것
		System.out.println(s);

		list.remove(1); // remove는 데이터 삭제
		System.out.println(list);

		System.out.println(list.indexOf("mango")); // mango의 위치 출력
	}
}