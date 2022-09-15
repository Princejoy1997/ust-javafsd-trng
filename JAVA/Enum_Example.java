package enum_prgms;

enum signal{
	
	RED(5),ORANGE(20),GREEN(15);
	private int x;
	private signal(int x) {
		this.x=x;
	}
	
	int getIndex() {
		
		return x;
	}
}
public class Enum_Example {

	public static void main(String[] args) {
		
		signal s=signal.GREEN;
		System.out.println(signal.GREEN.getIndex());
		System.out.println(s.ordinal());
		System.out.println(s.name());
		System.out.println(s.valueOf("RED"));
	}
}
