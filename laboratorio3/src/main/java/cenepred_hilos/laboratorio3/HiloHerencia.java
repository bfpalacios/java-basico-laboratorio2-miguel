package cenepred_hilos.laboratorio3;

public class HiloHerencia extends Thread{

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i);
		}
	}

}


