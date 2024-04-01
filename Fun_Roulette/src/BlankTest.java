
public class BlankTest {
	
	Roulette roulette = new Roulette();
	Player p = new Player();
	InputChecker ic = new InputChecker();
	
	boolean blank = false;
	boolean flag = true;
	int player1 = 0;
	int player2 = 0;
	int count = 1;
	final int randomNumber = roulette.rotate();
	int [] num = {1,2,3,4,5,6};
	
	public void blankShot(){
		boolean shotFired = false;
		do {
			if(count==1) {
				System.out.println("Player 1, Enter a number to decide your fate in Roulette");
				player1 = p.turnOfP1();
				blank = ic.validInput(player1);
				if(blank==false && !shotFired) {
					System.out.println("You have Entered a Wrong Input. This caused a mis-fire. Give a valid input again");
					blankShot();
				}
				blank = ic.wrongInput(player1, num);
				if(blank==false && !shotFired) {
					System.out.println("You have Entered a Wrong Input. This caused a blank shot to go off. Give a valid input again");
					blankShot();
				}
				count++;
				if(randomNumber==player1) {
					shotFired = true;
					System.out.println("Player 1, You have been Shot buddy. Now do this to get revived");
					//method call to do task
					FunActivity fa = new FunActivity();
					fa.funActs();
					flag = false;
				}
			}else {
				System.out.println("Player 2, Enter a number to decide your fate in Roulette");
				player2 = p.turnOfP2();
				blank = ic.validInput(player2);
				if(blank==false && !shotFired) {
					System.out.println("You have Entered a Wrong Input. This caused a mis-fire. Give a valid input again");
					blankShot();
				}
				blank = ic.wrongInput(player2, num);
				if(blank==false && !shotFired) {
					System.out.println("You have Entered a Wrong Input. This caused a blank shot to go off. Give a valid input again");
					blankShot();
				}
				count--;
				if(randomNumber==player2) {
					shotFired = true;
					System.out.println("Player 2, You have been Shot buddy. Now do this to get revived");
					//method call to do task
					FunActivity fa = new FunActivity();
					fa.funActs();
					flag = false;
				}
			}
		}while(flag && !shotFired);
	}
}
