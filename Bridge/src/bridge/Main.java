package bridge;

import bridge.platforms.Facebook;
import bridge.platforms.IPlatform;
import bridge.platforms.Twitch;
import bridge.platforms.Youtube;
import bridge.transmissions.AdvancedLive;
import bridge.transmissions.Live;
import bridge.transmissions.RecordedLive;

public class Main {
	public static void main(String[] args) {
		startLive(new Youtube());
		startLive(new Facebook());
		startLive(new Twitch());
		finishLive(new Youtube());
		finishLive(new Facebook());
	}
	
	public static void startLive( IPlatform platform ) {
//		System.out.println("Aguarde");
//		Live live = new Live(platform);
//		
//		live.broadcasting();
//		live.result();
		
		System.out.println( "Transmissão Avançada... AGuarde" );
		AdvancedLive advancedLive = new AdvancedLive( platform );
		advancedLive.broadcasting();
		advancedLive.comments();
		advancedLive.subtitles();
		advancedLive.result();
	}
	
	public static void finishLive( IPlatform platform ) {
		System.out.println("Finalizando transmissão");
		RecordedLive record = new RecordedLive( platform );
		
		record.endLive();
		record.records();
		System.out.println( "Gravação encerrada" );
		System.out.println( "*** Live Encerrada ***" );
	}
}	
