class Singer extends Person {
	public Singer(String name, int age, int height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public void eat(){ //�������̵�
		System.out.println("�����带 �Դ�");
	}
	public void sing(){
		System.out.println("�뷡�ϴ�");
	}
}