package quineClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public class Client implements ModInitializer {
	public static final Client INSTANCE = new Client();
	public Logger logger = LogManager.getLogger(Client.class);
	
	@Override
	public void onInitialize() {
		logger.info("hello world!");
	}
	
	public void onKeyPress(int key, int action) {
		
	}

	public void onTick() {
		
	}
}
