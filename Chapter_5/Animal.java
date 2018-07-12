import java.util.*;

abstract class Animal
{
	String name = "";
	abstract void eat();
}

class Wolf extends Animal
{
	public Wolf( String na)
	{
		name = na;
	}

	void eat()
	{
		System.out.println("I eat meat !");
	}
}

class Cat extends Animal implements CoolCat
{
	public Cat(String na)
	{
		name = na;
	}

	public void hug()
	{
		System.out.println("Big HUG !!");
	}

	void eat()
	{
		System.out.println("I eat crocket");
	}
}

