package com.austin.firstmod.init;

import com.austin.firstmod.item.ItemSapphire;
import com.austin.firstmod.item.ItemLMRB;
import com.austin.firstmod.item.ItemMapleLeaf;
import com.austin.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB sapphire = new ItemSapphire();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(sapphire, "sapphire");
    }
}
