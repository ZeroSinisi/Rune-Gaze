package zero.sinisi.rune.gaze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Gaze gaze = new Gaze(args[0]);
		HashMap<String, ArrayList<String>> data = gaze.getData();
		Set<String> keys = data.keySet();
		for(String s: keys) {
			System.out.print(s + ": ");
			for(String rune: data.get(s)) {
				System.out.print(rune + " ");
			}
			System.out.println();
		}
	}
	
}
