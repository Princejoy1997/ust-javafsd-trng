package optional;

import java.util.Optional;

public class Optional_Example4 {

	public static void main(String[] args) {
		 Optional<String> emptyOption = Optional.empty();
		 Optional<String> strOption = Optional.of("one");
		 System.out.println(emptyOption.orElseGet(() -> "optional null or ElseGet"));
		 System.out.println(strOption.orElseGet(() -> "Optional value or ElseGet"));
		 }
}
