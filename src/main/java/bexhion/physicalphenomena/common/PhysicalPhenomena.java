/**
 * This file was created by Bexhion on 28 Mar 2016, 19:48
 *
 * Physical Phenomena is an open source mod, distributed under the Physical Phenomena Licence. Get the source code here:
 * https://github.com/missingplayer/Physical-Phenomena
 */
package bexhion.physicalphenomena.common;

import net.minecraftforge.fml.common.Mod;

import bexhion.physicalphenomena.common.reference.RefMain;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefMain.MOD_ID, name = RefMain.NAME, version = RefMain.VERSION, dependencies = RefMain.DEPENDENCIES)
public class PhysicalPhenomena {

   @Mod.Instance(RefMain.MOD_ID)
   public static PhysicalPhenomena pp;

   @Mod.EventHandler
   public void preInit(FMLPreInitializationEvent event){

   }

   @Mod.EventHandler
   public void init(FMLInitializationEvent event){

   }

   @Mod.EventHandler
   public void postInit(FMLPostInitializationEvent event){

   }
}
