package Design_pattern;

interface Product {
	void doSomething();
}

//concrete Product A
class ProductA implements Product {

	@Override
	public void doSomething() {
		System.out.println("Product A is doing");

	}

}

//concrete Product B
class ProductB implements Product {

	@Override
	public void doSomething() {
		System.out.println("product B is doing");
	}

}

//abstract creator class(factory)
abstract class Creator {
	public abstract Product createProduct();

	public void doSomethingwithProduct() {
		Product product = createProduct();
		product.doSomething();
	}

}

//concrete class
class CreatorA extends Creator {

	@Override
	public Product createProduct() {

		return new ProductA();
	}

}

//concrete class
class CreatorB extends Creator {

	@Override
	public Product createProduct() {
		return new ProductB();

	}

}

public class FactoryPattern {
	public static void main(String[] args) {
		Creator creatorA = new CreatorA();
		creatorA.doSomethingwithProduct();

		Creator creatorB = new CreatorB();
		creatorB.doSomethingwithProduct();
	}

}
