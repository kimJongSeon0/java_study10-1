package day_2024_07_30;

class Box{
	
	private	int num;
	private String contents;
	
	public Box(int num, String contents) {
		this.contents = contents ;
		this.num = num;
	}
	
	public int getBoxNum() {
		return num;
	}
	
	public String toString() {
		return contents;
}

public class BoxClassTest {

	public static void main(String[] args) {
        Box[] ar = new Box[5];

        ar[0] = new Box(101, "Coffee");
        ar[1] = new Box(202, "Computer");
        ar[2] = new Box(303, "Apple");
        ar[3] = new Box(404, "Dress");
        ar[4] = new Box(505, "Fairy-tale book");

        // 배열에서 번호가 505인 Box를 찾아 그 내용물을 출력하는 반복문
        for (Box e : ar) {
            if (e.getBoxNum() == 505) {
                System.out.println(e);
            }
        }

    }

}
}

// "Box를 완성하시오."

