class Song{

	String title; //노래의 제목
	String artist; //가수
	String album; //노래가 속한 앨범 제목
	String composer; //노래의 작곡가, 여러 명이 있을 수 있음.
	int year; //노래가 발표된 연도
	int track; //노래가 속한 앨범에서의 트랙 번호

	public Song(){}; // 기본 생성자

	public Song(String ti, String ar, String al, String c, int y, int tr){
		this.title=ti;
		this.artist=ar;
		this.album=al;
		this.composer=c;
		this.year=y;
		this.track=tr;
	}

	public String show(){
		return ("노래의 제목은 "+title+", 가수는 "+artist+", 속한 앨범은 "+album+", 작곡가는 "+
	    composer+"입니다. 이 곡은 "+year+"년에 발표되었으며, 앨범에서의 트랙 번호는 "+track+"번입니다.");
	}

	public static void main(String args[]){
		Song s1=new Song();
		s1.title="Dancing Queen";
		s1.artist="ABBA";
		System.out.println(s1.show());
	}

}