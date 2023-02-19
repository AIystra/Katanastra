package com.astra.katanastra.entity.client;

import com.astra.katanastra.katanastraMod;
import com.astra.katanastra.registry.custom.DemonArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DemonArmorModel extends AnimatedGeoModel<DemonArmorItem> {
    @Override
    public Identifier getModelResource(DemonArmorItem object) {
        return new Identifier(katanastraMod.MODID, "geo/demon_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(DemonArmorItem object) {
        return new Identifier(katanastraMod.MODID, "textures/models/armor/demon_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(DemonArmorItem animatable) {
        return new Identifier(katanastraMod.MODID, "animations/armor_animation.json");
    }
}
