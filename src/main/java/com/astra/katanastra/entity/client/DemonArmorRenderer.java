package com.astra.katanastra.entity.client;

import com.astra.katanastra.registry.custom.DemonArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class DemonArmorRenderer extends GeoArmorRenderer<DemonArmorItem> {
    public DemonArmorRenderer() {
        super(new DemonArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
