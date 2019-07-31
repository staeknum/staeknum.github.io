package diceroll;

/**
 *
 * @author STAEKNUM
 * bean Class for DiceProject.
 */
public class PlayOnline {
	static int dotType;
	// what kind of dice-dot(1<var<127)

	public StringBuilder play(int dotType, int qty) {
		Roll roll = new Roll();
		StringBuilder sb = new StringBuilder();

		int res = 0;

		sb.append("<br>DiceRoll <br>");
		for (int i = 1; i <= qty; i++) {
			res = roll.rollingForQty(dotType);
			assert dotType >= 0 : "Input number is invailed. Can't use negative number.";
			sb.append("<br>");
			sb.append("Dice:");
			sb.append(i+": ");
			sb.append(res + "<br>");
		}
		return sb;
	}

}
