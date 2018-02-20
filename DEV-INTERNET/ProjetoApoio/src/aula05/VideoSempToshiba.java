package aula05;

public class VideoSempToshiba implements VideoCassete {
	public void play() {
		System.out.println("Semp Toshiba rodando a fita");
	}

	public void rebobinarFita() {
		System.out.println("Semp Toshiba rebobinando a fita");
	}

	public void stop() {
		System.out.println("Semp Toshiba parando a fita");
	}

	public String getNome() {
		return "Video Cassete Semp Toshiba";
	}
}