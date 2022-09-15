package eventHandling;

//Anonymus Class Example

abstract class Animal{
	abstract void sound();
}

public class NamelessClass {

	public static void main(String[] args) {
		
		Animal a=new Animal() {
			
			void sound() {
				System.out.println("Animal Sound");
			}
		};
		
		a.sound();
	}
}
