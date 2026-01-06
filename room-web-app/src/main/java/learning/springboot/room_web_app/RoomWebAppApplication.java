package learning.springboot.room_web_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import learning.springboot.room_web_app.data.repository.employeesRepository;
// import learning.springboot.room_web_app.data.repository.roomRepository;

@SpringBootApplication
public class RoomWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomWebAppApplication.class, args);
	}
	// @Bean
	// public CommandLineRunner run(roomRepository rp) {
	// 	return args -> {
	// 		// System.out.println("Kuldeep Sharma");
	// 		rp.findAll().forEach(System.out::println);
	// 	};
	// }
	@Bean
	public CommandLineRunner runs(employeesRepository ep) {
		return args -> {
			// System.out.println("Kuldeep Sharma");
			// ep.findAll().forEach(System.out::println);
		};
	}
	// @Bean
	// public CommandLineRunner run() {
		// return args -> {
		// 	// System.out.println("Kuldeep Sharma");
		// 	// rp.findAll().forEach(System.out::println);
		// 	System.out.println("Kuldeep Sharma");
		// };
	// }
}
