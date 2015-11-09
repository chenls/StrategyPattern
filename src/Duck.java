public class Duck {
	QuackBehavior quackBehavior; //鸭叫的行为

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performQuack() { //执行
		quackBehavior.quack();
	}

	public Duck() {
		super();
		System.out.println("Duck");
	}
}
