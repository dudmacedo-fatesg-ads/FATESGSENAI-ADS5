package aula05;

public class SalaDeEstar {
	public static void main(String[] args) {
		VideoCassete[] videos = new VideoCassete[2];
		videos[0] = new VideoPhilco();
		videos[1] = new VideoSempToshiba();
		for (VideoCassete vc : videos) {
			System.out.printf("\n\n%s:\n", vc.getNome());
			vc.play();
			vc.stop();
			vc.rebobinarFita();
		}
	}
}