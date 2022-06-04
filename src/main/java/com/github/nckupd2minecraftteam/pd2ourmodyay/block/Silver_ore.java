package com.github.nckupd2minecraftteam.pd2ourmodyay.block;

import com.github.nckupd2minecraftteam.pd2ourmodyay.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraftforge.common.ToolType;

import java.util.Arrays;
import java.util.List;

public class Silver_ore extends Block {
    public Silver_ore(){
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)); // Iron pickaxe and above
    }

    @Override
    @SuppressWarnings("deprecation")
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder){
        ResourceLocation resourcelocation = this.getLootTable();
        LootTableManager manager = builder.getWorld().getServer().getLootTableManager();

        if(manager.getLootTableFromLocation(resourcelocation) != LootTable.EMPTY_LOOT_TABLE){
            return super.getDrops(state, builder);
        }
        return Arrays.asList(new ItemStack(Items.SILVER_ORE));
    }
}
