public class NoDuck extends Duck {

	public NoDuck() {
		System.out.println("NoDuck");
		quackBehavior = new NoQuack();
	}
}