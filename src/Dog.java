
public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
	}
	
	public void Chew() {
		System.out.println("Chew method called");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		Chew();
		super.eat();
	}
	public void walk() {
		System.out.println("Dog.move() called");
		move(5);
	}
	public void run() {
		System.out.println("Dog.run() called"); 
		move(15);
	}
	
	

}
