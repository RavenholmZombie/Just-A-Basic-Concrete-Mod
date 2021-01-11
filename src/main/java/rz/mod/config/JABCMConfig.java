package rz.mod.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.LangKey;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rz.mod.util.Reference;

@SuppressWarnings("WeakerAccess")
@Config(modid = Reference.MOD_ID)
@LangKey(Reference.MOD_ID + ".config.title")
public final class JABCMConfig 
{
	@Comment("Set to false to disable all Rainbow Concrete potion effects.")
	public static boolean rainbowConcreteEffects = true;
	
	@Comment("Set to false to disable random quotes appearing during startup.")
	public static boolean showQuotes = true;
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	private static class EventHandler
	{
		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event)
		{
			if (event.getModID().equals(Reference.MOD_ID))
			{
				ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
			}
		}
	}
}
