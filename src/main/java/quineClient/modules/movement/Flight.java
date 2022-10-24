package quineClient.modules.movement;

import org.lwjgl.glfw.GLFW;

import quineClient.modules.Mod;

public class Flight extends Mod {

	public Flight() {
		super("Flight", "make u fly", Category.MOVEMENT);
		this.setKey(GLFW.GLFW_KEY_G);
	}

	
	@Override
	public void onTick() {
		mc.player.getAbilities().allowFlying = true;
		super.onTick();
	}
	
	
	
	@Override
	public void onDisable() {
		mc.player.getAbilities().allowFlying = false;
		super.onTick();
	}
}


	