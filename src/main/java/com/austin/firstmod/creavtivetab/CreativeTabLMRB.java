package com.austin.firstmod.creavtivetab;


import com.austin.firstmod.init.ModItems;
import com.austin.firstmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_Tab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.sapphire;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "First Mod";
        }


    };
}
