//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
for (int i = 0; i < 11; i++) {
		if (randomNumber == 1) {
JOptionPane.showMessageDialog(null, "You're a really great person who always helps out when someone needs it!");
}
else if(randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "Thanks for always being there to make me laugh and smile!");
}
else if(randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "You're my best friend! Thanks for all those times you cheered me up!");
}
else if(randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "I really enjoyed playing and practicing with you, you make everything fun!");
}
else if(randomNumber == 5) {
	JOptionPane.showMessageDialog(null, "Thanks for listening to all my problems and sympathizing with me!");
}
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
