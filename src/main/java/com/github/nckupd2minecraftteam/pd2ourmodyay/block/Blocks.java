package com.github.nckupd2minecraftteam.pd2ourmodyay.block;

import com.github.nckupd2minecraftteam.pd2ourmodyay.OurModYay;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OurModYay.MODID)
public class Blocks {
    public static final Silver_ore SILVER_ORE = null;

    public static DeferredRegister<Block> getRegister(){
        return Blocks.BlockRegistry.REGISTER;
    }

    @SuppressWarnings("unused")
    public static class BlockRegistry{
        public static final DeferredRegister<Block> REGISTER = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, OurModYay.MODID);

        public static final RegistryObject<Block> OBJ_TESTBLOCK = BlockRegistry.REGISTER.register("testblock", () -> new Testblock());
        public static final RegistryObject<Block> OBJ_SILVER_ORE = BlockRegistry.REGISTER.register("silver_ore", () -> new Silver_ore());
        public static final RegistryObject<Block> OBJ_SILVER_BLOCK = BlockRegistry.REGISTER.register("silver_block", () -> new Silver_block());
        public static final RegistryObject<Block> OBJ_AND_GATE= BlockRegistry.REGISTER.register("and_gate", () -> new And_gate((x1, x2) -> x1 && x2));
        public static final RegistryObject<Block> OBJ_NAND_GATE= BlockRegistry.REGISTER.register("nand_gate", () -> new NAnd_gate((x1, x2) -> !(x1 && x2)));
        public static final RegistryObject<Block> OBJ_XOR_GATE= BlockRegistry.REGISTER.register("xor_gate", () -> new Xor_gate((x1, x2) -> x1 ^ x2));
    }
}
