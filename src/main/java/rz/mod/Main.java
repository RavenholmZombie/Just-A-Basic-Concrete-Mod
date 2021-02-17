package rz.mod;

import java.io.File;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rz.mod.config.JABCMConfig;
import rz.mod.proxy.CommonProxy;
import rz.mod.tabs.JABCMBarriersTab;
import rz.mod.tabs.JABCMTab;
import rz.mod.tabs.JABCMTabRedstone;
import rz.mod.util.Quotes;
import rz.mod.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, updateJSON = Reference.UPDATE_JSON)
public class Main 
{
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	// Logger
	public static Logger logger;
	
	// Config
	public static File config;
	
	// Creative Tabs
	public static final CreativeTabs JABCMTAB = new JABCMTab("jabcm_tab");
	public static final CreativeTabs JABCMBARRIERS = new JABCMBarriersTab("jabcm_barrier_tab");
	public static final CreativeTabs JABCMTABREDSTONE = new JABCMTabRedstone("jabcm_tab_rs");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		logger = event.getModLog();
		logger.info("[JABCM] Version " + Reference.VERSION + " loading...");
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		logger.info("[JABCM] Version " + Reference.VERSION + " loaded successfully");
		
		if(JABCMConfig.showQuotes)
		{
			Quotes.QuoteSelect();
		}

	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}
