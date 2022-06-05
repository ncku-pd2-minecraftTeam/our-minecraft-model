package com.github.nckupd2minecraftteam.pd2ourmodyay.block;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;
import com.github.nckupd2minecraftteam.pd2ourmodyay.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ComparatorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraftforge.common.ToolType;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class And_gate extends Logicgate {

    public And_gate(BiFunction<Boolean, Boolean, Boolean> calculateOutputFunction){
        super(calculateOutputFunction);
    }


    @Override
    @SuppressWarnings("deprecation")
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder){
        ResourceLocation resourcelocation = this.getLootTable();
        LootTableManager manager = builder.getWorld().getServer().getLootTableManager();

        if(manager.getLootTableFromLocation(resourcelocation) != LootTable.EMPTY_LOOT_TABLE){
            return super.getDrops(state, builder);
        }
        return Arrays.asList(new ItemStack(Items.AND_GATE));
    }
}
