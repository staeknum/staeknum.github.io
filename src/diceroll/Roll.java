package diceroll;
/**
 *
 * @author STAEKNUM
 * Rolling Dice Method
 *ダイスロールのメソッド定義。ランダムメソッドを実行しているだけ。
 */

public class Roll {

	public byte roll() {
		return 0;
	}
	public int rollingForQty(int dot) {
		int six =  (int)((Math.random() * dot) + 1);
		return six;
	}
}
