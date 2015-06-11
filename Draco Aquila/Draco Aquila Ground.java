// Date: 6/11/2015 10:49:56 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelDraco Aquila extends ModelBase
{
  //fields
    ModelRenderer groundLeftTopLeg;
    ModelRenderer groundLeftLeg;
    ModelRenderer groundLeftFoot;
    ModelRenderer groundRightTopLeg;
    ModelRenderer groundRightLeg;
    ModelRenderer groundRightFoot;
    ModelRenderer groundTailFeathers;
    ModelRenderer groundLeftWing;
    ModelRenderer groundRightWing;
    ModelRenderer groundBeakTop;
    ModelRenderer groundBeakBottom;
    ModelRenderer groundBody;
    ModelRenderer groundHead;
  
  public ModelDraco Aquila()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      groundLeftTopLeg = new ModelRenderer(this, 99, 0);
      groundLeftTopLeg.addBox(-2.5F, 0F, -2.5F, 5, 7, 5);
      groundLeftTopLeg.setRotationPoint(6F, 4F, 0F);
      groundLeftTopLeg.setTextureSize(512, 256);
      groundLeftTopLeg.mirror = true;
      setRotation(groundLeftTopLeg, 0F, 0F, 0F);
      groundLeftLeg = new ModelRenderer(this, 82, 0);
      groundLeftLeg.addBox(-1.5F, 7F, -1.5F, 3, 13, 3);
      groundLeftLeg.setRotationPoint(6F, 4F, 0F);
      groundLeftLeg.setTextureSize(512, 256);
      groundLeftLeg.mirror = true;
      setRotation(groundLeftLeg, 0F, 0F, 0F);
      groundLeftFoot = new ModelRenderer(this, 111, 0);
      groundLeftFoot.addBox(-5.5F, 20F, -9.5F, 11, 0, 11);
      groundLeftFoot.setRotationPoint(6F, 4F, 0F);
      groundLeftFoot.setTextureSize(512, 256);
      groundLeftFoot.mirror = true;
      setRotation(groundLeftFoot, 0F, 0F, 0F);
      groundRightTopLeg = new ModelRenderer(this, 99, 0);
      groundRightTopLeg.addBox(-2.5F, 0F, -2.5F, 5, 7, 5);
      groundRightTopLeg.setRotationPoint(-6F, 4F, 0F);
      groundRightTopLeg.setTextureSize(512, 256);
      groundRightTopLeg.mirror = true;
      setRotation(groundRightTopLeg, 0F, 0F, 0F);
      groundRightLeg = new ModelRenderer(this, 82, 0);
      groundRightLeg.addBox(-1.5F, 7F, -1.5F, 3, 13, 3);
      groundRightLeg.setRotationPoint(-6F, 4F, 0F);
      groundRightLeg.setTextureSize(512, 256);
      groundRightLeg.mirror = true;
      setRotation(groundRightLeg, 0F, 0F, 0F);
      groundRightFoot = new ModelRenderer(this, 111, 0);
      groundRightFoot.addBox(-5.5F, 20F, -9.5F, 11, 0, 11);
      groundRightFoot.setRotationPoint(-6F, 4F, 0F);
      groundRightFoot.setTextureSize(512, 256);
      groundRightFoot.mirror = true;
      setRotation(groundRightFoot, 0F, 0F, 0F);
      groundTailFeathers = new ModelRenderer(this, 0, 57);
      groundTailFeathers.addBox(-10F, 0F, 10F, 20, 15, 0);
      groundTailFeathers.setRotationPoint(0F, 5F, 0F);
      groundTailFeathers.setTextureSize(512, 256);
      groundTailFeathers.mirror = true;
      setRotation(groundTailFeathers, 0.1745329F, 0F, 0F);
      groundLeftWing = new ModelRenderer(this, 81, 4);
      groundLeftWing.addBox(12F, -30F, -8F, 0, 40, 15);
      groundLeftWing.setRotationPoint(-1F, 5F, 0F);
      groundLeftWing.setTextureSize(512, 256);
      groundLeftWing.mirror = true;
      setRotation(groundLeftWing, 0.1745329F, 0F, -0.0349066F);
      groundRightWing = new ModelRenderer(this, 181, 4);
      groundRightWing.addBox(-10F, -30F, -8F, 0, 40, 15);
      groundRightWing.setRotationPoint(-1F, 5F, 0F);
      groundRightWing.setTextureSize(512, 256);
      groundRightWing.mirror = true;
      setRotation(groundRightWing, 0.1745329F, 0F, 0.0349066F);
      groundBeakTop = new ModelRenderer(this, 41, 54);
      groundBeakTop.addBox(-2.5F, -5F, -13.5F, 5, 1, 5);
      groundBeakTop.setRotationPoint(0F, -25F, -6F);
      groundBeakTop.setTextureSize(512, 256);
      groundBeakTop.mirror = true;
      setRotation(groundBeakTop, 0F, 0F, 0F);
      groundBeakBottom = new ModelRenderer(this, 41, 61);
      groundBeakBottom.addBox(-2.5F, -4.146667F, -13.5F, 5, 1, 5);
      groundBeakBottom.setRotationPoint(0F, -25F, -6F);
      groundBeakBottom.setTextureSize(512, 256);
      groundBeakBottom.mirror = true;
      setRotation(groundBeakBottom, 0F, 0F, 0F);
      groundBody = new ModelRenderer(this, 0, 0);
      groundBody.addBox(-10F, -30F, -10F, 20, 30, 20);
      groundBody.setRotationPoint(0F, 5F, 0F);
      groundBody.setTextureSize(512, 256);
      groundBody.mirror = true;
      setRotation(groundBody, 0.1745329F, 0F, 0F);
      groundHead = new ModelRenderer(this, 112, 14);
      groundHead.addBox(-8.5F, -15F, -8.5F, 17, 17, 17);
      groundHead.setRotationPoint(0F, -25F, -6F);
      groundHead.setTextureSize(512, 256);
      groundHead.mirror = true;
      setRotation(groundHead, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    groundLeftTopLeg.render(f5);
    groundLeftLeg.render(f5);
    groundLeftFoot.render(f5);
    groundRightTopLeg.render(f5);
    groundRightLeg.render(f5);
    groundRightFoot.render(f5);
    groundTailFeathers.render(f5);
    groundLeftWing.render(f5);
    groundRightWing.render(f5);
    groundBeakTop.render(f5);
    groundBeakBottom.render(f5);
    groundBody.render(f5);
    groundHead.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
