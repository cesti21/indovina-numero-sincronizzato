package model;

public class Numero {
	public int random;
	public int tentativi = 5;

	public Numero(int tentativi) {
		this.random = (int) (Math.random() * 20);
		this.tentativi = tentativi;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getTentativi() {
		return tentativi;
	}

	public void setTentativi(int tentativi) {
		this.tentativi = tentativi;
	}


	@Override
	public String toString() {
		return "Numero [random=" + random + ", tentativi=" + tentativi + "]";
	}
}
