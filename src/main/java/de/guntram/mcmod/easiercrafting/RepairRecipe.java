/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.guntram.mcmod.easiercrafting;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 *
 * @author gbl
 */
public class RepairRecipe implements IRecipe {
    
    private Item item;

    public RepairRecipe(Item item) {
        this.item=item;
    }
    
    public Item getItem() {
        return item;
    }
    
    @Override
    public boolean matches(IInventory inv, World worldIn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return new ItemStack(item);
    }

    @Override
    public boolean canFit(int width, int height) {
        return true;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return new ItemStack(item);
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredients = NonNullList.create();
        ingredients.add(Ingredient.fromStacks(new ItemStack(item)));
        ingredients.add(Ingredient.fromStacks(new ItemStack(item)));
        return ingredients;
    }

    @Override
    public ResourceLocation getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}