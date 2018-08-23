package Hw1;

import static java.lang.System.out;

import java.util.EnumMap;

public class TimeTable {

	enum DAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	}

	public void initialize() {
		int[][] showTimeTable = new int[10][5];

		for (int i = 0; i < showTimeTable.length; i++) {
			for (int j = 0; j < showTimeTable[i].length; j++) {
				if (i == 3) {
					out.print("BREAK\t");
				} else if (i == 7) {
					out.print("LUNCH\t");
				} else {
					out.print("- - - -\t");
				}
			}
			out.println();
		}

	}

}
