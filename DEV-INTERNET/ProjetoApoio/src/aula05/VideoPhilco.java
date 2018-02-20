package aula05;

public class VideoPhilco implements VideoCassete {
	public void play() {
		System.out.println("Philco rodando a fita");
	}

	public void rebobinarFita() {
		System.out.println("Philco rebobinando a fita");
	}

	public void stop() {
		System.out.println("Philco parando a fita");
	}

	public String getNome() {
		return "Video Cassete Philco";
	}
}