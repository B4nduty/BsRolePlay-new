package banduty.bsroleplay.item.client;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.LawyerPurpleAndRedItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class LawyerPurpleAndRedModel extends GeoModel<LawyerPurpleAndRedItem> {

    @Override
    public Identifier getModelResource(LawyerPurpleAndRedItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "geo/lawyer.geo.json");
    }

    @Override
    public Identifier getTextureResource(LawyerPurpleAndRedItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "textures/armor/lawyer_purple_and_red.png");
    }

    @Override
    public Identifier getAnimationResource(LawyerPurpleAndRedItem animatable) {
        return new Identifier(BsRolePlay.MOD_ID, "animations/armors.animation.json");
    }
}
