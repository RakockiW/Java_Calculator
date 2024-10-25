package kalkulator;

public class Calculator {
	private int state = 0;
	private int memory = 0;

	public int getState() {
		return state;
	}

	public int getMemory() {
		return memory;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void storeInMemory() {
		memory = state;
	}

	public void clearMemory() {
		memory = 0;
	}

	public void add(int value) {
		try {
			state = Math.addExact(state, value);
		} catch (Exception e) {
			state = 0;
		}
	}

	public void mult(int value) {
		try {
			state = Math.multiplyExact(state, value);
		} catch (Exception e) {
			state = 0;
		}
	}

	public void sub(int value) {
		try {
			state = Math.subtractExact(state, value);
		} catch (Exception e) {
			state = 0;
		}
	}

	public void div(int value) {
		try {
			state /= value;
		} catch (Exception e) {
			state = 0;
		}
	}

	public void addFromMemory() {
		add(memory);
	}

	public void subFromMemory() {
		sub(memory);
	}

	public void divFromMemory() {
		div(memory);
	}

	public void multFromMemory() {
		mult(memory);
	}

}
