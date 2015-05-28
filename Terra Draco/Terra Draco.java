// Date: 5/27/2015 10:16:58 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelTerra Draco extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer backSpikes;
    ModelRenderer head;
    ModelRenderer jaw;
    ModelRenderer frontRightLeg;
    ModelRenderer frontRightFoot;
    ModelRenderer frontLeftLeg;
    ModelRenderer frontLeftFoot;
    ModelRenderer backLeftLeg;
    ModelRenderer backLeftFoot;
    ModelRenderer backRightLeg;
    ModelRenderer backRightFoot;
    ModelRenderer leftWing;
    ModelRenderer rightWing;
  
  public ModelTerra Draco()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(-15F, 0F, 0F, 30, 16, 50);
      body.setRotationPoint(0F, -10F, -25F);
      body.setTextureSize(512, 256);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      backSpikes = new ModelRenderer(this, 0, 22);
      backSpikes.addBox(-0.5F, -16F, 0F, 0, 16, 50);
      backSpikes.setRotationPoint(0F, -10F, -25F);
      backSpikes.setTextureSize(512, 256);
      backSpikes.mirror = true;
      setRotation(backSpikes, 0F, 0F, 0F);
      head = new ModelRenderer(this, 161, 0);
      head.addBox(-10F, -10F, -22F, 20, 10, 22);
      head.setRotationPoint(0F, -10F, -25F);
      head.setTextureSize(512, 256);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      jaw = new ModelRenderer(this, 0, 97);
      jaw.addBox(-12.5F, 0F, -25F, 25, 15, 25);
      jaw.setRotationPoint(0F, -10F, -25F);
      jaw.setTextureSize(512, 256);
      jaw.mirror = true;
      setRotation(jaw, 0F, 0F, 0F);
      frontRightLeg = new ModelRenderer(this, 0, 150);
      frontRightLeg.addBox(-5F, 0F, -5F, 10, 15, 10);
      frontRightLeg.setRotationPoint(-15F, -3F, -18F);
      frontRightLeg.setTextureSize(512, 256);
      frontRightLeg.mirror = true;
      setRotation(frontRightLeg, 0F, 0F, 0F);
      frontRightFoot = new ModelRenderer(this, 0, 180);
      frontRightFoot.addBox(-6F, 15F, -6F, 12, 12, 12);
      frontRightFoot.setRotationPoint(-15F, -3F, -18F);
      frontRightFoot.setTextureSize(512, 256);
      frontRightFoot.mirror = true;
      setRotation(frontRightFoot, 0F, 0F, 0F);
      frontLeftLeg = new ModelRenderer(this, 50, 150);
      frontLeftLeg.addBox(-5F, 0F, -5F, 10, 15, 10);
      frontLeftLeg.setRotationPoint(15F, -3F, -18F);
      frontLeftLeg.setTextureSize(512, 256);
      frontLeftLeg.mirror = true;
      setRotation(frontLeftLeg, 0F, 0F, 0F);
      frontLeftFoot = new ModelRenderer(this, 50, 180);
      frontLeftFoot.addBox(-6F, 15F, -6F, 12, 12, 12);
      frontLeftFoot.setRotationPoint(15F, -3F, -18F);
      frontLeftFoot.setTextureSize(512, 256);
      frontLeftFoot.mirror = true;
      setRotation(frontLeftFoot, 0F, 0F, 0F);
      backLeftLeg = new ModelRenderer(this, 100, 150);
      backLeftLeg.addBox(-5F, 0F, -5F, 10, 15, 10);
      backLeftLeg.setRotationPoint(11F, -3F, 15F);
      backLeftLeg.setTextureSize(512, 256);
      backLeftLeg.mirror = true;
      setRotation(backLeftLeg, 0F, 0F, 0F);
      backLeftFoot = new ModelRenderer(this, 100, 180);
      backLeftFoot.addBox(-6F, 15F, -6F, 12, 12, 12);
      backLeftFoot.setRotationPoint(11F, -3F, 15F);
      backLeftFoot.setTextureSize(512, 256);
      backLeftFoot.mirror = true;
      setRotation(backLeftFoot, 0F, 0F, 0F);
      backRightLeg = new ModelRenderer(this, 150, 150);
      backRightLeg.addBox(-5F, 0F, -5F, 10, 15, 10);
      backRightLeg.setRotationPoint(-11F, -3F, 15F);
      backRightLeg.setTextureSize(512, 256);
      backRightLeg.mirror = true;
      setRotation(backRightLeg, 0F, 0F, 0F);
      backRightFoot = new ModelRenderer(this, 150, 180);
      backRightFoot.addBox(-6F, 15F, -6F, 12, 12, 12);
      backRightFoot.setRotationPoint(-11F, -3F, 15F);
      backRightFoot.setTextureSize(512, 256);
      backRightFoot.mirror = true;
      setRotation(backRightFoot, 0F, 0F, 0F);
      leftWing = new ModelRenderer(this, 210, 70);
      leftWing.addBox(0F, 0F, -25F, 50, 0, 50);
      leftWing.setRotationPoint(14F, -8F, 0F);
      leftWing.setTextureSize(512, 256);
      leftWing.mirror = true;
      setRotation(leftWing, 0F, 0F, -1.22173F);
      rightWing = new ModelRenderer(this, 210, 140);
      rightWing.addBox(-50F, 0F, -25F, 50, 0, 50);
      rightWing.setRotationPoint(-14F, -8F, 0F);
      rightWing.setTextureSize(512, 256);
      rightWing.mirror = true;
      setRotation(rightWing, 0F, 0F, 1.22173F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    backSpikes.render(f5);
    head.render(f5);
    jaw.render(f5);
    frontRightLeg.render(f5);
    frontRightFoot.render(f5);
    frontLeftLeg.render(f5);
    frontLeftFoot.render(f5);
    backLeftLeg.render(f5);
    backLeftFoot.render(f5);
    backRightLeg.render(f5);
    backRightFoot.render(f5);
    leftWing.render(f5);
    rightWing.render(f5);
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