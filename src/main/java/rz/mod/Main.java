package rz.mod;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
	
	// Creative Tabs
	public static final CreativeTabs JABCMTAB = new JABCMTab("jabcm_tab");
	public static final CreativeTabs JABCMTABREDSTONE = new JABCMTabRedstone("jabcm_tab_rs");
	public static final CreativeTabs JABCMBARRIERS = new JABCMBarriersTab("jabcm_barrier_tab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		System.out.println("[JABCM] Version " + Reference.VERSION + " loading...");
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		System.out.println("[JABCM] Version " + Reference.VERSION + " loaded successfully");
		Quotes.QuoteSelect();
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}
