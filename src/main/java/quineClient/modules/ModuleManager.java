package quineClient.modules;

import java.util.ArrayList;
import java.util.List;

import quineClient.modules.movement.Flight;

public class ModuleManager {
	
	public static final ModuleManager INSTANCE = new ModuleManager();
	private List<Mod> modules = new ArrayList<>();
	
	public ModuleManager() {
		addModules();
	}
	
	public List<Mod> getModules() {
		return modules;
	}
	
	public List<Mod> getEnabledModules() {
		List<Mod> enabled = new ArrayList<>();
		for (Mod module : modules) {
			 if (module.isEnabled()) enabled.add(module);
		 }
		return enabled;
	}
	
	private void addModules() {
		modules.add(new Flight());
	}
	
	
}
