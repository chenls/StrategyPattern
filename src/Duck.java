public class Duck {
	QuackBehavior quackBehavior; //Ѽ�е���Ϊ

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performQuack() { //ִ��
		quackBehavior.quack();
	}

	public Duck() {
		super();
		System.out.println("Duck");
	}
}
