package net.anas.tutorialmod.item;

import net.anas.tutorialmod.TutorialMod;
import net.anas.tutorialmod.item.custom.FuelItem;
import net.anas.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
          DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

  public static final RegistryObject<Item> ANASITEM = ITEMS.register("anasitem",
          () -> new Item(new Item.Properties()));
  public static final RegistryObject<Item> ANAS = ITEMS.register("anas",
            () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
          () -> new MetalDetectorItem(new Item.Properties().durability(100)));

  public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
          () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

  public static final RegistryObject<Item> ANAS_STAFF = ITEMS.register("anas_staff",
          () -> new Item(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> POTION_OF_FIRE_RESISTANCE = ITEMS.register("potion_of_fire_resistance",
          () -> new Item(new Item.Properties().food(ModFoods.POTION_OF_FIRE_RESISTANCE)));


  public static final RegistryObject<Item> POTION_OF_SPEED = ITEMS.register("potion_of_speed",
          () -> new Item(new Item.Properties().food(ModFoods.POTION_OF_SPEED)));

  public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
          () -> new FuelItem(new Item.Properties(), 400));

  public static final RegistryObject<Item> ANAS_BLADE = ITEMS.register("anas_blade",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_AXE = ITEMS.register("anas_axe",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_SWORD = ITEMS.register("anas_sword",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_PICKAXE = ITEMS.register("anas_pickaxe",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_OP_AXE = ITEMS.register("anas_op_axe",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_OP_SWORD = ITEMS.register("anas_op_sword",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_OP_PICKAXE = ITEMS.register("anas_op_pickaxe",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_OP_SHOVEL = ITEMS.register("anas_op_shovel",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> ANAS_OP_HOE = ITEMS.register("anas_op_hoe",
          () -> new Item(new Item.Properties()));

  public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
  }
}
