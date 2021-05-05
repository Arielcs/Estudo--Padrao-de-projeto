package bridge;

import bridge.platforms.Facebook;
import bridge.platforms.IPlatform;
import bridge.platforms.Twitch;
import bridge.platforms.Youtube;
import bridge.transmissions.AdvancedLive;
import bridge.transmissions.Live;

public class Main {
	public static void main(String[] args) {
		startLive(new Youtube());
		startLive(new Facebook());
		startLive(new Twitch());
	}
	
	public static void startLive( IPlatform platform ) {
//		System.out.println("Aguarde");
//		Live live = new Live(platform);
//		
//		live.broadcasting();
//		live.result();
		
		System.out.println("Transmissão Avançada... AGuarde");
		AdvancedLive advancedLive = new AdvancedLive(platform);
		advancedLive.broadcasting();
		advancedLive.comments();
		advancedLive.subtitles();
		advancedLive.result();
	}
}	
