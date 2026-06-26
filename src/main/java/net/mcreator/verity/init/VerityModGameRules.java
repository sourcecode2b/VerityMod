/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.verity.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VerityModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DISTURBED_1 = GameRules.register("disturbed1", GameRules.Category.MOBS, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DONE = GameRules.register("done", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DAYSTHREWW = GameRules.register("daysthreww", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DAYSTHREWW_2 = GameRules.register("daysthreww2", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DAYSTHREWW_1 = GameRules.register("daysthreww1", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> MONSTERTIME = GameRules.register("monstertime", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> EVILTALK = GameRules.register("eviltalk", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> NORMALTALK = GameRules.register("normaltalk", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> TALKANGRY = GameRules.register("talkangry", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> VIDEOHAPPENED = GameRules.register("videohappened", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}