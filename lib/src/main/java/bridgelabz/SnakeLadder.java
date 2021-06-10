package bridgelabz;

public class SnakeLadder {
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int winning_points = 100;
	public static void main(String[] args) {
		int player_position = 0;
		int count = 1;
			// printing the random Variable(1-6) as dies 
		for ( int dice = 0; player_position < winning_points; dice++ ){
		int random = (int)(Math.random()*6) + 1;
			// Checking for random values to set Ladder and Snake
		int check = (int)(Math.random()*3);
			// the function of ladder and snake
		int result = 0;	
		switch ( check ){
			// Checking in the ladder to get the exact winning position
			case ladder:
				if( (player_position + random) <= 100 ){
					player_position += random; }
				else
					player_position += 0;
				break;
			case snake:
				result -= random;
				break;
			default:
				result = 0;

		}
			//player_position += result;
		player_position = player_position + result;
		count++;
		}
		System.out.println("Winning Position of Player : " +player_position+ " WINNNER "+"\n"+"No.of times the dice rolled : "+count);
}
}
