package parte2;

public class Number {
	private int i = 0;

	public void add() {
		i = i + 1;
	}

	public void sub() {
		i = i - 1;
	}
	
	@Override
	public String toString() {
		return Integer.toString(i);
	}
}