package Accessmodifiers;

import java.util.Random;



public class HR {

	public static void main(String... args) {
		System.out.println(randomString(-229985452) + ' ' + randomString(-147909649));
		//System.out.println(x);
		
		// create random object
        Random r = new Random();
  
        // return the next pseudorandom integer value
        System.out.println("Random Integer value : "
                           + r.nextInt());
  
        // setting seed
        long s = 27;
  
        r.setSeed(s);
  
        // value after setting seed
        System.out.println("Random Integer value : "
                           + r.nextInt());
	}

	public static String randomString(int seed) {
		Random rand = new Random(seed);
		StringBuilder sb = new StringBuilder();
		for (int i = 0;; i++) {
			int n = rand.nextInt(27);
			if (n == 0)
				break;
			sb.append((char) ('`' + n));
		}
		return sb.toString();
	}

}
