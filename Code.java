
public class Code{
	
	public static void main(String[] args) {
//		Cat c = new Cat();
//		c.weight = 30;
//		c.species = "New Species";
//		c.makeNoise();
//		Dog d = new Dog();
//		d.weight = 50;
//		d.species = "New Dog Species";
//		d.makeNoise();
//		User1 u1 = new User1();
//		User2 u2 = new User2();
//		u1.checkGrades();
//		u2.updateGrades();
		//u1.updateGrades(); => this won't work
		//u2.checkGrades(); => this won't work
//		u1.name = "Hello";
		//Polymorphism
	}
}
class Food{
	int waterContent;
	int calories;
	public void eat() {
		System.out.println("Food is eaten");
	}
}
class Burger extends Food{
	int pattySize;
	public void eat() {
		System.out.println("Burger is eaten");
	}
}
class VeggieBurger extends Burger{
	int veggiecontent;
	public void eat() {
		System.out.println("Veggie Burger is eaten");
	}
}
class Pizza extends Food{
	String pizzaSize;
	public void eat() {
		System.out.println("Pizza is eaten");
	}
}
class CheesePizza extends Pizza{
	String cheeseAmount;
	public void eat() {
		System.out.println("Cheese Pizza is eaten");
	}
}
class Animal{
	int weight;
	String species;
	public void makeNoise() {
		System.out.println("Animal makes noise");
	}
}
class Cat extends Animal{
	public void makeNoise() {
		System.out.println("Cat meows");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Bark");
	}
	public void makeNoise() {
		bark();
	}
}
class User{
	String email;
	String password;
	String id;
}
class User1 extends User{
	//similar to student
	public void checkGrades() {
		System.out.println("Grades are checked");
	}
}
class User2 extends User{
	String name;
	//similar to teacher
	public void updateGrades() {
		System.out.println("Grades are updated");
	}
}
class Toys{
	String color;
	int width;
	int length;
	int height;
}
class CarToys extends Toys{
	int numWheels;
	int height = 4;
}
class BallToys extends Toys{
	int width = 0;
	int length = 0;
	int height = 0;
	int diameter;
	int bounce;
}
class Shape{
	int numSides;
	int numCorners;
	int numAngles;
	int perimeter;
	int area;
}
class Rectangle extends Shape{
	int numSides = 4;
	int numCorners = 4;
	int numAngles = 4;
	int angles = 90;
}
class Square extends Rectangle{
	boolean sidesAreEqual = true;
	
}
class Triangle extends Shape{
	int numSides = 3;
	int numCorners = 3;
	int numAngles = 3;
}
class EquilateralTriangle extends Triangle{
	boolean sidesAreEqual = true;
	int angles = 60;
}
