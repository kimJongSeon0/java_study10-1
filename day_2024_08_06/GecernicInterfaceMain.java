package day_2024_08_06;

interface Eatable {
	public String eat();
}

class Apple implements Eatable {

	public String toString() {
		return "i am an apple";
	}

	@Override
	public String eat() {
		return "It tastes so good!";
	}
}

class Box<T extends Eatable> {
	public T obj;

	public T get() {
		System.out.println(obj.eat());
		return obj;
	}

	public void set(T t) {
		obj = t;
	}
}

public class GecernicInterfaceMain {

	public static void main(String[] args) {

		Box<Apple> box = new Box<>();
		box.set(new Apple());

		Apple ap = box.get();
		System.out.println(ap);
	}

}
