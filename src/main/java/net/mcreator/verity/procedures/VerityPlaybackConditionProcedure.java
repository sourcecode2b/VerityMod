package net.mcreator.verity.procedures;

public class VerityPlaybackConditionProcedure {
	public static boolean execute() {
		if (Math.random() > 0.999) {
			return true;
		}
		return false;
	}
}