package quineClient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import quineClient.modules.Mod;
import quineClient.modules.ModuleManager;

public class Client implements ModInitializer {
	public static final Client INSTANCE = new Client();
	public Logger logger = LogManager.getLogger(Client.class);
	
	private MinecraftClient mc = MinecraftClient.getInstance();
	
	@Override
	public void onInitialize() {
		logger.info("hello world!");
	}
	
	public void onKeyPress(int key, int action) {
		if (action == GLFW.GLFW_PRESS) {
			for (Mod module : ModuleManager.INSTANCE.getModules()) {
				if (key == module.getKey()) module.toggle();
			}
		}
		
	}

	public void onTick() {
		if(mc.player != null) {
			for (Mod module : ModuleManager.INSTANCE.getEnabledModules()) {
				module.onTick();
			}
		}
	}
}
