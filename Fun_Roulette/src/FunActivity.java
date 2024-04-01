import java.util.Random;

public class FunActivity {
public void funActs() {
		Random r = new Random();
		int act = r.nextInt(10)+1;
		System.out.print("Fate has decided to make you ");
		if(act<6) {
			if(act==1) {
				System.out.println("Truth");
			}else if(act==2) {
				System.out.println("Dare");
			}else if(act==3) {
				System.out.println("Dance");
			}else if(act==4) {
				System.out.println("Sing");
			}else if(act==5) {
				System.out.println("Mimic");
			}
		}else if(act>5){
			if(act==6) {
				System.out.println("Behave like ...... animal");
			}else if(act==7) {
				System.out.println("Tell a embarrassing story of childhood");
			}else if(act==8) {
				System.out.println("Recreate your first propose");
			}else if(act==9) {
				System.out.println("Tell a joke");
			}else if(act==10) {
				System.out.println("Tell a lie you believed to be true");
			}
		}
	}
}
 