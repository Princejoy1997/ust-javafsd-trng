package optional;

import java.util.Optional;

public class Optional_Example {

	public static void main(String[] args) {
		
		Optional<String> optional=Optional.of("hello");
		
		if(optional.isPresent()) {
			String value=optional.get();
			System.out.println("Optional value : "+value);
		}else {
			System.out.println("Optional has no value");
		}
	}
}
