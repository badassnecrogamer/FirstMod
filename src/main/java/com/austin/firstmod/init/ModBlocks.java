package com.austin.firstmod.init;


import com.austin.firstmod.block.BlockFlag;
import com.austin.firstmod.block.BlockLMRB;
import com.austin.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}