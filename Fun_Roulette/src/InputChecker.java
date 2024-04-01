
public class InputChecker {
	
	public boolean validInput(int num) {
		if(num>0 && num<7) {
			return true;
		}
		return false;
	}
	
	public boolean wrongInput(int num, int [] barrel) {
		for(int i = 0; i<6; i++) {
			if(barrel[i]==num) {
				barrel[i] = 0;
				return true;
			}
		}
		return false;
	}
}
