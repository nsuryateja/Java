import java.util.*;

public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Map<Integer, String> maps = new HashMap<>();
		maps.put(1,"Surya");
		maps.put(2,"Mohan");
		maps.put(3,"Pradeep");
		maps.put(4,"Sunny");

		maps.forEach((key, value) -> System.out.println(key + " " + value));

		maps.entrySet().forEach(x->{System.out.println(x.getKey() + " " + x.getValue() );});

		maps.keySet().forEach(entry -> {
			System.out.println(entry + " " + maps.get(entry));
		});

		System.out.println(List.of(maps));

		System.out.println(Collections.singletonList(maps));

	}
	}
