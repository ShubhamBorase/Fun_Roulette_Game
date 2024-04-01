import java.util.Random;

public class Roulette {
	public int rotate() {
		
		Random r = new Random();
		
		return r.nextInt(6)+1;
	}
}
