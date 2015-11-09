public class Test {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.performQuack();

		mallardDuck.setQuackBehavior(new NoQuack());
		mallardDuck.performQuack();

		NoDuck noDuck = new NoDuck();
		noDuck.performQuack();

	}
}
