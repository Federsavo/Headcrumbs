package ganymedes01.headcrumbs.renderers.heads.grimoireOfGaia;

import ganymedes01.headcrumbs.renderers.ModelHead;
import net.minecraft.client.model.ModelRenderer;

public class SatyrHead extends ModelHead {

	public static final SatyrHead INSTANCE = new SatyrHead();

	protected SatyrHead() {
	}

	@Override
	public void init() {
		textureWidth = 128;
		textureHeight = 64;
		float f0 = 1;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3.0F, -6.0F, -3.0F + f0, 6, 6, 6);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0F, 0.0F, 0.0F);
		overlay = new ModelRenderer(this, 36, 0);
		overlay.addBox(-3.5F, -6.5F, -3.5F + f0, 7, 7, 7);
		overlay.setTextureSize(64, 32);
		overlay.mirror = true;
		setRotation(overlay, 0.0F, 0.0F, 0.0F);
		ModelRenderer horns = new ModelRenderer(this, 36, 30);
		horns.addBox(-4.5F, -10.5F, -5.5F + f0, 9, 7, 4);
		horns.setTextureSize(64, 32);
		horns.mirror = true;
		setRotation(horns, -0.4363323F, 0.0F, 0.0F);

		head.addChild(horns);
	}
}