package storm;

import java.util.UUID;

public class TestUUID {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(UUID.randomUUID().toString().replace("-", ""));
		}
	}

}
