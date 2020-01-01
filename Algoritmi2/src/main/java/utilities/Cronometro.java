package utilities;

public class Cronometro {
	
	long start;
	long end;
	
	public void start() {
		this.start = System.currentTimeMillis();
	}
	
	public void end() {
		this.end = System.currentTimeMillis();
		System.out.println("Durata: " + (end - start) + "ms");
	}

}
