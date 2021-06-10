package bridgelabz;

public class SnakeLadder {

	public static void main(String[] args) {
		int player_position = 0; 
		int random = (int)(Math.random()*6) + 1;
		int check = (int)(Math.random()*3);
		if ( check == 1 ) {
			player_position += random;
		}
		else if ( check == 2 ) {
			player_position -= random;
		}
		else 
			player_position = player_position;
			System.out.println(" Position of Player : " +player_position);
	}
}
