public class Player {
  public Player(int cakes) {
  }
	// Decide who move first - player or opponent (true if player)
	public boolean firstMove(int cakes) {
		// I wish to move first
		if(cakes <= 2 | cakes%4 == 2) {return false;}
		return true;
	}
	
	// Decide your next move
	public int move(int cakes, int last) {
		// I'm not greedy
		if(cakes <= 2) {
		    return last == 1 ? 2 : 1;
	    }
	    int potentialMove = (cakes - 2) % 4;
	    if( potentialMove == last) {
	        return potentialMove + 1;
	    } else {
	        return potentialMove;
	    }
	}
}