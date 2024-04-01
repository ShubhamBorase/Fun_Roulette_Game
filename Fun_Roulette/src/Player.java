import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Player {
	
	int turnOfP1(){
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return num;
	}
	int turnOfP2(){
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return num;
	}
}
