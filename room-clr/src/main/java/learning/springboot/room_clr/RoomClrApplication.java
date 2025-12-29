package learning.springboot.room_clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomClrApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomClrApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner run() {
	// 	return args -> {
	// 		for (int i = 0; i <= 10; i++) {
	// 			System.out.println("Counting: " + i);
	// 		}
	// 	};
		
	// }
	@Bean
	public CommandLineRunner run() {
		return args -> {
			for (int i = 0; i <= 100; i++) {
				// System.out.println("Counting: " + i);
				// if (i %3 == 0 && i %5 == 0) {
				// 	System.out.println("FizzBuzz");
				// } else {
				// 	if (i %3 == 0) {
				// 		System.out.println("Fizz");
				// 	} else if (i %5 == 0) {
				// 		System.out.println("Buzz");
				// 	} else {
				// 		System.out.println(i);
				// 	}
				// }
				String res = "";
				res += (i % 3) == 0 ? "Fizz" : "";
				res += (i % 5) == 0 ? "Buzz" : "";
				System.out.println(!res.isEmpty() ? res : i);
			}
		};
	}
}
