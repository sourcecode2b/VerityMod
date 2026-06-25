package net.mcreator.verity.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelballofverity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("verity", "modelballofverity"), "main");
	public final ModelPart sphere;
	public final ModelPart face;

	public Modelballofverity(ModelPart root) {
		this.sphere = root.getChild("sphere");
		this.face = this.sphere.getChild("face");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition sphere = partdefinition.addOrReplaceChild("sphere",
				CubeListBuilder.create().texOffs(-112, -204).addBox(-0.3521F, -7.9922F, -0.0309F, 0.7042F, 15.9844F, 0.0618F, new CubeDeformation(0.0F)).texOffs(-112, -204)
						.addBox(-0.2999F, -7.9805F, -0.4714F, 0.5997F, 15.9609F, 0.9428F, new CubeDeformation(0.0F)).texOffs(90, 20).addBox(-1.5465F, -7.8281F, -0.5734F, 3.093F, 15.6563F, 1.1467F, new CubeDeformation(0.0F)).texOffs(8, 219)
						.addBox(-0.5021F, -7.8164F, -1.6284F, 1.0041F, 15.6328F, 3.2568F, new CubeDeformation(0.0F)).texOffs(68, 231).addBox(-1.3641F, -7.7969F, -1.1611F, 2.7281F, 15.5938F, 2.3221F, new CubeDeformation(0.0F)).texOffs(198, -190)
						.addBox(-1.8563F, -7.7773F, -0.259F, 3.7126F, 15.5547F, 0.518F, new CubeDeformation(0.0F)).texOffs(8, 219).addBox(-0.9476F, -7.7656F, -1.6725F, 1.8951F, 15.5313F, 3.345F, new CubeDeformation(0.0F)).texOffs(90, 20)
						.addBox(-1.7654F, -7.7461F, -0.9389F, 3.5308F, 15.4922F, 1.8777F, new CubeDeformation(0.0F)).texOffs(114, 0).addBox(-0.3364F, -7.7344F, -2.0165F, 0.6729F, 15.4688F, 4.033F, new CubeDeformation(0.0F)).texOffs(-130, 227)
						.addBox(-1.4146F, -7.7148F, -1.5748F, 2.8293F, 15.4297F, 3.1496F, new CubeDeformation(0.0F)).texOffs(-134, 176).addBox(-2.1062F, -7.6953F, -0.5883F, 4.2124F, 15.3906F, 1.1766F, new CubeDeformation(0.0F)).texOffs(47, 144)
						.addBox(-0.8298F, -7.6836F, -2.0673F, 1.6597F, 15.3672F, 4.1346F, new CubeDeformation(0.0F)).texOffs(-28, 230).addBox(-1.8636F, -7.6641F, -1.3376F, 3.7272F, 15.3281F, 2.6751F, new CubeDeformation(0.0F)).texOffs(114, 0)
						.addBox(-0.0736F, -7.6523F, -2.3316F, 0.1473F, 15.3047F, 4.6631F, new CubeDeformation(0.0F)).texOffs(92, 177).addBox(-2.3545F, -7.6445F, -0.1319F, 4.709F, 15.2891F, 0.2638F, new CubeDeformation(0.0F)).texOffs(-130, 227)
						.addBox(-1.3491F, -7.6328F, -1.9799F, 2.6982F, 15.2656F, 3.9598F, new CubeDeformation(0.0F)).texOffs(-134, 176).addBox(-2.2574F, -7.6133F, -0.9707F, 4.5147F, 15.2266F, 1.9414F, new CubeDeformation(0.0F)).texOffs(47, 144)
						.addBox(-0.6119F, -7.6016F, -2.417F, 1.2239F, 15.2031F, 4.8339F, new CubeDeformation(0.0F)).texOffs(-146, 227).addBox(-1.8563F, -7.582F, -1.7512F, 3.7127F, 15.1641F, 3.5024F, new CubeDeformation(0.0F)).texOffs(37, 18)
						.addBox(-2.5625F, -7.5625F, -0.492F, 5.125F, 15.125F, 0.9841F, new CubeDeformation(0.0F)).texOffs(96, 226).addBox(-1.1837F, -7.5508F, -2.3632F, 2.3675F, 15.1016F, 4.7263F, new CubeDeformation(0.0F)).texOffs(-222, 228)
						.addBox(-2.3145F, -7.5313F, -1.3869F, 4.6289F, 15.0625F, 2.7738F, new CubeDeformation(0.0F)).texOffs(184, 220).addBox(-0.6009F, -7.3867F, -3.0125F, 1.2018F, 14.7734F, 6.025F, new CubeDeformation(0.0F)).texOffs(-164, 218)
						.addBox(-2.1561F, -7.3672F, -2.2529F, 4.3122F, 14.7344F, 4.5059F, new CubeDeformation(0.0F)).texOffs(194, -23).addBox(-3.0729F, -7.3477F, -0.7546F, 6.1458F, 14.6953F, 1.5092F, new CubeDeformation(0.0F)).texOffs(126, 215)
						.addBox(-1.2817F, -7.3359F, -2.9226F, 2.5634F, 14.6719F, 5.8451F, new CubeDeformation(0.0F)).texOffs(166, 220).addBox(-2.687F, -7.3164F, -1.8028F, 5.3741F, 14.6328F, 3.6056F, new CubeDeformation(0.0F)).texOffs(-70, 221)
						.addBox(-0.2059F, -7.3047F, -3.2556F, 0.4117F, 14.6094F, 6.5113F, new CubeDeformation(0.0F)).texOffs(54, 231).addBox(-3.2786F, -7.2969F, -0.08F, 6.5572F, 14.5938F, 0.16F, new CubeDeformation(0.0F)).texOffs(-8, 219)
						.addBox(-1.9466F, -7.2852F, -2.6715F, 3.8933F, 14.5703F, 5.3431F, new CubeDeformation(0.0F)).texOffs(80, 223).addBox(-3.1161F, -7.2656F, -1.2249F, 6.2322F, 14.5313F, 2.4499F, new CubeDeformation(0.0F)).texOffs(184, 220)
						.addBox(-0.9308F, -7.2539F, -3.2426F, 1.8617F, 14.5078F, 6.4852F, new CubeDeformation(0.0F)).texOffs(178, 167).addBox(-2.557F, -7.2344F, -2.264F, 5.114F, 14.4688F, 4.5279F, new CubeDeformation(0.0F)).texOffs(194, -23)
						.addBox(-3.4132F, -7.2148F, -0.5443F, 6.8264F, 14.4297F, 1.0886F, new CubeDeformation(0.0F)).texOffs(174, -60).addBox(-1.6564F, -7.2031F, -3.0613F, 3.3127F, 14.4063F, 6.1226F, new CubeDeformation(0.0F)).texOffs(16, 217)
						.addBox(-3.0757F, -7.1836F, -1.7135F, 6.1514F, 14.3672F, 3.427F, new CubeDeformation(0.0F)).texOffs(-180, 213).addBox(-0.515F, -7.1719F, -3.507F, 1.03F, 14.3438F, 7.014F, new CubeDeformation(0.0F)).texOffs(-240, 208)
						.addBox(-2.3425F, -7.1523F, -2.7123F, 4.685F, 14.3047F, 5.4247F, new CubeDeformation(0.0F)).texOffs(80, 223).addBox(-3.4694F, -7.1328F, -1.0424F, 6.9387F, 14.2656F, 2.0848F, new CubeDeformation(0.0F)).texOffs(-42, 209)
						.addBox(-1.2918F, -7.1211F, -3.409F, 2.5835F, 14.2422F, 6.818F, new CubeDeformation(0.0F)).texOffs(178, 167).addBox(-2.95F, -7.1016F, -2.2057F, 5.9F, 14.2031F, 4.4115F, new CubeDeformation(0.0F)).texOffs(-22, 209)
						.addBox(-0.0447F, -7.0898F, -3.7057F, 0.0894F, 14.1797F, 7.4114F, new CubeDeformation(0.0F)).texOffs(102, 1).addBox(-3.7103F, -7.082F, -0.2806F, 7.4205F, 14.1641F, 0.5612F, new CubeDeformation(0.0F)).texOffs(166, 200)
						.addBox(-2.047F, -7.0703F, -3.1338F, 4.0939F, 14.1406F, 6.2676F, new CubeDeformation(0.0F)).texOffs(16, 217).addBox(-3.4425F, -7.0508F, -1.5606F, 6.885F, 14.1016F, 3.1213F, new CubeDeformation(0.0F)).texOffs(-180, 213)
						.addBox(-0.861F, -7.0391F, -3.7027F, 1.722F, 14.0781F, 7.4055F, new CubeDeformation(0.0F)).texOffs(88, 204).addBox(-2.7395F, -7.0195F, -2.6873F, 5.479F, 14.0391F, 5.3745F, new CubeDeformation(0.0F)).texOffs(97, 12)
						.addBox(-3.7885F, -7.0F, -0.8044F, 7.577F, 14.0F, 1.6088F, new CubeDeformation(0.0F)).texOffs(-108, 202).addBox(-1.6758F, -6.9883F, -3.5151F, 3.3516F, 13.9766F, 7.0301F, new CubeDeformation(0.0F)).texOffs(-220, 210)
						.addBox(-3.3301F, -6.9688F, -2.0849F, 6.6602F, 13.9375F, 4.1698F, new CubeDeformation(0.0F)).texOffs(-198, 213).addBox(-0.3736F, -6.957F, -3.9319F, 0.7471F, 13.9141F, 7.8639F, new CubeDeformation(0.0F)).texOffs(-162, 198)
						.addBox(-2.4466F, -6.9375F, -3.1441F, 4.8931F, 13.875F, 6.2882F, new CubeDeformation(0.0F)).texOffs(180, -89).addBox(-3.7837F, -6.918F, -1.3511F, 7.5674F, 13.8359F, 2.7022F, new CubeDeformation(0.0F)).texOffs(146, 200)
						.addBox(-1.2361F, -6.9063F, -3.8439F, 2.4722F, 13.8125F, 7.6879F, new CubeDeformation(0.0F)).texOffs(66, 200).addBox(-3.1316F, -6.8867F, -2.6011F, 6.2633F, 13.7734F, 5.2023F, new CubeDeformation(0.0F)).texOffs(-240, 227)
						.addBox(-4.071F, -6.8672F, -0.518F, 8.1421F, 13.7344F, 1.036F, new CubeDeformation(0.0F)).texOffs(158, -87).addBox(-2.0757F, -6.8555F, -3.5629F, 4.1514F, 13.7109F, 7.1257F, new CubeDeformation(0.0F)).texOffs(-140, 209)
						.addBox(-3.6924F, -6.8359F, -1.9069F, 7.3848F, 13.6719F, 3.8138F, new CubeDeformation(0.0F)).texOffs(-88, 202).addBox(-0.7367F, -6.8242F, -4.1094F, 1.4733F, 13.6484F, 8.2188F, new CubeDeformation(0.0F)).texOffs(-186, 193)
						.addBox(-2.8487F, -6.8047F, -3.0953F, 5.6974F, 13.6094F, 6.1907F, new CubeDeformation(0.0F)).texOffs(34, 218).addBox(-4.0953F, -6.7852F, -1.0908F, 8.1907F, 13.5703F, 2.1816F, new CubeDeformation(0.0F)).texOffs(-108, 202)
						.addBox(-1.6333F, -6.7734F, -3.931F, 3.2666F, 13.5469F, 7.862F, new CubeDeformation(0.0F)).texOffs(-8, 200).addBox(-3.5133F, -6.7539F, -2.4579F, 7.0266F, 13.5078F, 4.9158F, new CubeDeformation(0.0F)).texOffs(108, 204)
						.addBox(-0.1878F, -6.7422F, -4.3021F, 0.3757F, 13.4844F, 8.6041F, new CubeDeformation(0.0F)).texOffs(194, -36).addBox(-4.3142F, -6.7344F, -0.1895F, 8.6284F, 13.4688F, 0.3791F, new CubeDeformation(0.0F)).texOffs(158, -87)
						.addBox(-2.4849F, -6.7227F, -3.554F, 4.9699F, 13.4453F, 7.108F, new CubeDeformation(0.0F)).texOffs(92, 23).addBox(-4.032F, -6.7031F, -1.6765F, 8.0641F, 13.4063F, 3.3531F, new CubeDeformation(0.0F)).texOffs(126, 194)
						.addBox(-1.1274F, -6.6914F, -4.2372F, 2.2547F, 13.3828F, 8.4745F, new CubeDeformation(0.0F)).texOffs(66, 200).addBox(-3.2473F, -6.6719F, -2.9902F, 6.4946F, 13.3438F, 5.9804F, new CubeDeformation(0.0F)).texOffs(44, 195)
						.addBox(-0.3612F, -6.3945F, -4.7937F, 0.7224F, 12.7891F, 9.5874F, new CubeDeformation(0.0F)).texOffs(192, -60).addBox(-4.8173F, -6.3867F, -0.0594F, 9.6346F, 12.7734F, 0.1188F, new CubeDeformation(0.0F)).texOffs(136, -22)
						.addBox(-2.8932F, -6.375F, -3.8716F, 5.7863F, 12.75F, 7.7431F, new CubeDeformation(0.0F)).texOffs(73, 13).addBox(-4.5431F, -6.3555F, -1.7229F, 9.0862F, 12.7109F, 3.4458F, new CubeDeformation(0.0F)).texOffs(-158, 176)
						.addBox(-1.4013F, -6.3438F, -4.6683F, 2.8026F, 12.6875F, 9.3366F, new CubeDeformation(0.0F)).texOffs(-184, 174).addBox(-3.7071F, -6.3242F, -3.2034F, 7.4142F, 12.6484F, 6.4067F, new CubeDeformation(0.0F)).texOffs(184, -204)
						.addBox(-4.8721F, -6.3047F, -0.7168F, 9.7441F, 12.6094F, 1.4336F, new CubeDeformation(0.0F)).texOffs(-88, 165).addBox(-2.4028F, -6.293F, -4.3157F, 4.8056F, 12.5859F, 8.6314F, new CubeDeformation(0.0F)).texOffs(16, 200)
						.addBox(-4.3655F, -6.2734F, -2.3635F, 8.731F, 12.5469F, 4.7271F, new CubeDeformation(0.0F)).texOffs(156, 167).addBox(-0.7828F, -6.2617F, -4.9171F, 1.5655F, 12.5234F, 9.8343F, new CubeDeformation(0.0F)).texOffs(128, -204)
						.addBox(-3.3158F, -6.2422F, -3.7471F, 6.6317F, 12.4844F, 7.4941F, new CubeDeformation(0.0F)).texOffs(180, -114).addBox(-4.8322F, -6.2227F, -1.3886F, 9.6644F, 12.4453F, 2.7772F, new CubeDeformation(0.0F)).texOffs(-240, 168)
						.addBox(-1.8434F, -6.2109F, -4.6932F, 3.6868F, 12.4219F, 9.3864F, new CubeDeformation(0.0F)).texOffs(154, -105).addBox(-4.0937F, -6.1914F, -2.9846F, 8.1874F, 12.3828F, 5.9692F, new CubeDeformation(0.0F)).texOffs(24, 178)
						.addBox(-0.1225F, -6.1797F, -5.079F, 0.2451F, 12.3594F, 10.158F, new CubeDeformation(0.0F)).texOffs(-118, 223).addBox(-5.0797F, -6.1719F, -0.3226F, 10.1595F, 12.3438F, 0.6452F, new CubeDeformation(0.0F)).texOffs(118, -115)
						.addBox(-2.8426F, -6.1602F, -4.2393F, 5.6852F, 12.3203F, 8.4787F, new CubeDeformation(0.0F)).texOffs(-134, 193).addBox(-4.6954F, -6.1406F, -2.0607F, 9.3907F, 12.2813F, 4.1214F, new CubeDeformation(0.0F)).texOffs(-158, 176)
						.addBox(-1.2248F, -6.1289F, -4.9936F, 2.4496F, 12.2578F, 9.9873F, new CubeDeformation(0.0F)).texOffs(76, 158).addBox(-3.7304F, -6.1094F, -3.5721F, 7.4608F, 12.2188F, 7.1441F, new CubeDeformation(0.0F)).texOffs(178, -169)
						.addBox(-5.0873F, -6.0898F, -1.0162F, 10.1747F, 12.1797F, 2.0325F, new CubeDeformation(0.0F)).texOffs(19, 144).addBox(-2.2949F, -6.0781F, -4.668F, 4.5898F, 12.1563F, 9.3359F, new CubeDeformation(0.0F)).texOffs(154, -105)
						.addBox(-4.4612F, -6.0586F, -2.7187F, 8.9224F, 12.1172F, 5.4374F, new CubeDeformation(0.0F)).texOffs(2, 178).addBox(-0.5582F, -6.0469F, -5.208F, 1.1165F, 12.0938F, 10.4161F, new CubeDeformation(0.0F)).texOffs(51, 6)
						.addBox(-3.2803F, -6.0273F, -4.1123F, 6.5606F, 12.0547F, 8.2245F, new CubeDeformation(0.0F)).texOffs(73, 13).addBox(-4.996F, -6.0078F, -1.7163F, 9.9921F, 12.0156F, 3.4327F, new CubeDeformation(0.0F)).texOffs(18, 156)
						.addBox(-1.6819F, -5.9961F, -5.0217F, 3.3638F, 11.9922F, 10.0435F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-4.1316F, -5.9766F, -3.3483F, 8.2631F, 11.9531F, 6.6965F, new CubeDeformation(0.0F)).texOffs(100, 18)
						.addBox(-5.3049F, -5.957F, -0.6101F, 10.6097F, 11.9141F, 1.2202F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.7502F, -5.9453F, -4.5923F, 5.5004F, 11.8906F, 9.1847F, new CubeDeformation(0.0F)).texOffs(52, 18)
						.addBox(-4.8047F, -5.9258F, -2.4084F, 9.6093F, 11.8516F, 4.8168F, new CubeDeformation(0.0F)).texOffs(130, 171).addBox(-1.0145F, -5.9141F, -5.291F, 2.029F, 11.8281F, 10.582F, new CubeDeformation(0.0F)).texOffs(23, 14)
						.addBox(-3.7105F, -5.8945F, -3.9354F, 7.4209F, 11.7891F, 7.8707F, new CubeDeformation(0.0F)).texOffs(-70, 206).addBox(-5.2635F, -5.875F, -1.3342F, 10.527F, 11.75F, 2.6684F, new CubeDeformation(0.0F)).texOffs(18, 9)
						.addBox(-2.1487F, -5.8633F, -5.0005F, 4.2974F, 11.7266F, 10.001F, new CubeDeformation(0.0F)).texOffs(128, -81).addBox(-4.5142F, -5.8438F, -3.0777F, 9.0284F, 11.6875F, 6.1555F, new CubeDeformation(0.0F)).texOffs(68, 177)
						.addBox(-0.3048F, -5.832F, -5.4676F, 0.6096F, 11.6641F, 10.9352F, new CubeDeformation(0.0F)).texOffs(186, 200).addBox(-5.4816F, -5.8242F, -0.1746F, 10.9632F, 11.6484F, 0.3492F, new CubeDeformation(0.0F)).texOffs(70, 4)
						.addBox(-3.2039F, -5.8125F, -4.4665F, 6.4078F, 11.625F, 8.9331F, new CubeDeformation(0.0F)).texOffs(156, -204).addBox(-5.1197F, -5.793F, -2.0567F, 10.2394F, 11.5859F, 4.1135F, new CubeDeformation(0.0F)).texOffs(130, 171)
						.addBox(-1.4861F, -5.7813F, -5.3262F, 2.9722F, 11.5625F, 10.6524F, new CubeDeformation(0.0F)).texOffs(34, 14).addBox(-4.1278F, -5.7617F, -3.71F, 8.2556F, 11.5234F, 7.42F, new CubeDeformation(0.0F)).texOffs(100, 18)
						.addBox(-5.494F, -5.7422F, -0.9182F, 10.988F, 11.4844F, 1.8363F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.6198F, -5.7305F, -4.9294F, 5.2396F, 11.4609F, 9.8587F, new CubeDeformation(0.0F)).texOffs(82, -41)
						.addBox(-4.0851F, -5.5469F, -4.0674F, 8.1702F, 11.0938F, 8.1349F, new CubeDeformation(0.0F)).texOffs(88, 10).addBox(-5.6482F, -5.5273F, -1.2434F, 11.2965F, 11.0547F, 2.4867F, new CubeDeformation(0.0F)).texOffs(18, 9)
						.addBox(-2.4546F, -5.5156F, -5.2491F, 4.9092F, 11.0313F, 10.4981F, new CubeDeformation(0.0F)).texOffs(36, 18).addBox(-4.904F, -5.4961F, -3.1214F, 9.8081F, 10.9922F, 6.2429F, new CubeDeformation(0.0F)).texOffs(104, 171)
						.addBox(-0.5076F, -5.4844F, -5.8021F, 1.0152F, 10.9688F, 11.6041F, new CubeDeformation(0.0F)).texOffs(-96, 224).addBox(-5.8316F, -5.4766F, -0.0016F, 11.6631F, 10.9531F, 0.0032F, new CubeDeformation(0.0F)).texOffs(52, 1)
						.addBox(-3.5536F, -5.4648F, -4.6376F, 7.1072F, 10.9297F, 9.2752F, new CubeDeformation(0.0F)).texOffs(-96, 187).addBox(-5.5046F, -5.4453F, -2.012F, 11.0092F, 10.8906F, 4.0239F, new CubeDeformation(0.0F)).texOffs(75, 14)
						.addBox(-1.7558F, -5.4336F, -5.603F, 3.5115F, 10.8672F, 11.206F, new CubeDeformation(0.0F)).texOffs(11, 21).addBox(-4.5025F, -5.4141F, -3.7968F, 9.005F, 10.8281F, 7.5936F, new CubeDeformation(0.0F)).texOffs(82, 18)
						.addBox(-5.8546F, -5.3945F, -0.7893F, 11.7091F, 10.7891F, 1.5787F, new CubeDeformation(0.0F)).texOffs(40, 4).addBox(-2.941F, -5.3828F, -5.1357F, 5.8821F, 10.7656F, 10.2715F, new CubeDeformation(0.0F)).texOffs(-71, 159)
						.addBox(-5.2537F, -5.3633F, -2.763F, 10.5073F, 10.7266F, 5.526F, new CubeDeformation(0.0F)).texOffs(-240, 145).addBox(-1.0056F, -5.3516F, -5.8609F, 2.0112F, 10.7031F, 11.7217F, new CubeDeformation(0.0F)).texOffs(-240, 103)
						.addBox(-4.0059F, -5.332F, -4.4184F, 8.0119F, 10.6641F, 8.8367F, new CubeDeformation(0.0F)).texOffs(-38, 195).addBox(-5.7683F, -5.3125F, -1.5825F, 11.5365F, 10.625F, 3.1651F, new CubeDeformation(0.0F)).texOffs(68, 3)
						.addBox(-2.2577F, -5.3008F, -5.5502F, 4.5153F, 10.6016F, 11.1004F, new CubeDeformation(0.0F)).texOffs(36, 18).addBox(-4.8979F, -5.2813F, -3.4812F, 9.7958F, 10.5625F, 6.9625F, new CubeDeformation(0.0F)).texOffs(11, 21)
						.addBox(-4.8567F, -5.0664F, -3.8398F, 9.7134F, 10.1328F, 7.6796F, new CubeDeformation(0.0F)).texOffs(102, -2).addBox(-6.1746F, -5.0469F, -0.6348F, 12.3493F, 10.0938F, 1.2696F, new CubeDeformation(0.0F)).texOffs(98, 20)
						.addBox(-3.2581F, -5.0352F, -5.2945F, 6.5162F, 10.0703F, 10.589F, new CubeDeformation(0.0F)).texOffs(44, 157).addBox(-5.6049F, -5.0156F, -2.7254F, 11.2099F, 10.0313F, 5.4509F, new CubeDeformation(0.0F)).texOffs(-240, 123)
						.addBox(-1.2492F, -5.0039F, -6.1156F, 2.4985F, 10.0078F, 12.2312F, new CubeDeformation(0.0F)).texOffs(40, -10).addBox(-4.3473F, -4.9844F, -4.5008F, 8.6946F, 9.9688F, 9.0016F, new CubeDeformation(0.0F)).texOffs(164, -29)
						.addBox(-6.0988F, -4.9648F, -1.4679F, 12.1976F, 9.9297F, 2.9358F, new CubeDeformation(0.0F)).texOffs(42, -166).addBox(-2.5496F, -4.9531F, -5.7416F, 5.0992F, 9.9063F, 11.4832F, new CubeDeformation(0.0F)).texOffs(65, 1)
						.addBox(-4.0629F, -4.5547F, -5.1719F, 8.1257F, 9.1094F, 10.3437F, new CubeDeformation(0.0F)).texOffs(41, 16).addBox(-6.2166F, -4.5352F, -2.1876F, 12.4333F, 9.0703F, 4.3752F, new CubeDeformation(0.0F)).texOffs(18, 1)
						.addBox(-2.0489F, -4.5234F, -6.2722F, 4.0977F, 9.0469F, 12.5444F, new CubeDeformation(0.0F)).texOffs(40, -89).addBox(-5.1055F, -4.5039F, -4.201F, 10.211F, 9.0078F, 8.402F, new CubeDeformation(0.0F)).texOffs(96, -13)
						.addBox(-6.5758F, -4.4844F, -0.806F, 13.1515F, 8.9688F, 1.6119F, new CubeDeformation(0.0F)).texOffs(98, 17).addBox(-3.3654F, -4.4727F, -5.7157F, 6.7307F, 8.9453F, 11.4315F, new CubeDeformation(0.0F)).texOffs(18, 15)
						.addBox(-5.919F, -4.4531F, -3.0224F, 11.8381F, 8.9063F, 6.0447F, new CubeDeformation(0.0F)).texOffs(78, 3).addBox(-1.2042F, -4.4414F, -6.544F, 2.4085F, 8.8828F, 13.088F, new CubeDeformation(0.0F)).texOffs(2, -80)
						.addBox(-4.5373F, -4.4219F, -4.8847F, 9.0745F, 8.8438F, 9.7694F, new CubeDeformation(0.0F)).texOffs(76, 8).addBox(-6.4626F, -4.4023F, -1.6895F, 12.9252F, 8.8047F, 3.379F, new CubeDeformation(0.0F)).texOffs(16, 19)
						.addBox(-2.5943F, -4.3906F, -6.1638F, 5.1886F, 8.7813F, 12.3275F, new CubeDeformation(0.0F)).texOffs(84, 13).addBox(-5.5077F, -4.3711F, -3.8155F, 11.0155F, 8.7422F, 7.6311F, new CubeDeformation(0.0F)).texOffs(108, -22)
						.addBox(-0.3235F, -4.3594F, -6.7001F, 0.6469F, 8.7188F, 13.4002F, new CubeDeformation(0.0F)).texOffs(180, -99).addBox(-6.7078F, -4.3516F, -0.2637F, 13.4156F, 8.7031F, 0.5275F, new CubeDeformation(0.0F)).texOffs(-30, -157)
						.addBox(-3.8763F, -4.3398F, -5.49F, 7.7527F, 8.6797F, 10.9799F, new CubeDeformation(0.0F)).texOffs(120, -95).addBox(-6.2289F, -4.3203F, -2.5564F, 12.4579F, 8.6406F, 5.1128F, new CubeDeformation(0.0F)).texOffs(55, 1)
						.addBox(-1.7631F, -4.3086F, -6.506F, 3.5262F, 8.6172F, 13.0119F, new CubeDeformation(0.0F)).texOffs(2, -80).addBox(-4.9888F, -4.2891F, -4.5515F, 9.9775F, 8.5781F, 9.103F, new CubeDeformation(0.0F)).texOffs(164, -16)
						.addBox(-6.6644F, -4.2695F, -1.1649F, 13.3288F, 8.5391F, 2.3298F, new CubeDeformation(0.0F)).texOffs(-202, 9).addBox(-3.1338F, -4.2578F, -6.0042F, 6.2677F, 8.5156F, 12.0083F, new CubeDeformation(0.0F)).texOffs(18, 15)
						.addBox(-5.8774F, -4.2383F, -3.3902F, 11.7548F, 8.4766F, 6.7803F, new CubeDeformation(0.0F)).texOffs(8, 7).addBox(-0.8866F, -4.2266F, -6.7343F, 1.7731F, 8.4531F, 13.4685F, new CubeDeformation(0.0F)).texOffs(-240, 4)
						.addBox(-4.3703F, -4.207F, -5.2155F, 8.7406F, 8.4141F, 10.431F, new CubeDeformation(0.0F)).texOffs(58, 27).addBox(-6.4982F, -4.1875F, -2.0586F, 12.9965F, 8.375F, 4.1172F, new CubeDeformation(0.0F)).texOffs(73, 3)
						.addBox(-2.3225F, -4.1758F, -6.4163F, 4.6451F, 8.3516F, 12.8326F, new CubeDeformation(0.0F)).texOffs(22, 24).addBox(-5.4129F, -4.1563F, -4.1745F, 10.8258F, 8.3125F, 8.349F, new CubeDeformation(0.0F)).texOffs(96, -13)
						.addBox(-6.8195F, -4.1367F, -0.6181F, 13.639F, 8.2734F, 1.2361F, new CubeDeformation(0.0F)).texOffs(-160, -32).addBox(-3.4231F, -3.9102F, -6.0822F, 6.8462F, 7.8203F, 12.1644F, new CubeDeformation(0.0F)).texOffs(78, -56)
						.addBox(-6.1623F, -3.8906F, -3.2998F, 12.3247F, 7.7813F, 6.5995F, new CubeDeformation(0.0F)).texOffs(54, -115).addBox(-1.1318F, -3.8789F, -6.9046F, 2.2635F, 7.7578F, 13.8092F, new CubeDeformation(0.0F)).texOffs(-122, -20)
						.addBox(-4.668F, -3.8594F, -5.2264F, 9.336F, 7.7188F, 10.4527F, new CubeDeformation(0.0F)).texOffs(140, -168).addBox(-6.7541F, -3.8398F, -1.9072F, 13.5082F, 7.6797F, 3.8145F, new CubeDeformation(0.0F)).texOffs(-34, -72)
						.addBox(-2.5983F, -3.8281F, -6.5264F, 5.1965F, 7.6563F, 13.0529F, new CubeDeformation(0.0F)).texOffs(2, 12).addBox(-5.7038F, -3.8086F, -4.1184F, 11.4076F, 7.6172F, 8.2368F, new CubeDeformation(0.0F)).texOffs(100, -204)
						.addBox(-0.2023F, -3.7969F, -7.0387F, 0.4045F, 7.5938F, 14.0773F, new CubeDeformation(0.0F)).texOffs(180, -123).addBox(-7.0336F, -3.7891F, -0.4141F, 14.0672F, 7.5781F, 0.8283F, new CubeDeformation(0.0F)).texOffs(-160, -52)
						.addBox(-3.9544F, -3.7773F, -5.8391F, 7.9088F, 7.5547F, 11.6781F, new CubeDeformation(0.0F)).texOffs(12, 11).addBox(-6.4801F, -3.7578F, -2.8085F, 12.9602F, 7.5156F, 5.6169F, new CubeDeformation(0.0F)).texOffs(-204, 50)
						.addBox(-1.7155F, -3.7461F, -6.8574F, 3.4309F, 7.4922F, 13.7148F, new CubeDeformation(0.0F)).texOffs(85, -8).addBox(-5.1355F, -3.7266F, -4.8723F, 10.2709F, 7.4531F, 9.7447F, new CubeDeformation(0.0F)).texOffs(-160, -32)
						.addBox(-3.1597F, -3.6953F, -6.353F, 6.3195F, 7.3906F, 12.706F, new CubeDeformation(0.0F)).texOffs(-240, -99).addBox(-6.0846F, -3.6758F, -3.6697F, 12.1691F, 7.3516F, 7.3394F, new CubeDeformation(0.0F)).texOffs(-206, 109)
						.addBox(-0.7905F, -3.6641F, -7.0675F, 1.581F, 7.3281F, 14.135F, new CubeDeformation(0.0F)).texOffs(-80, -21).addBox(-4.4666F, -3.6445F, -5.5468F, 8.9332F, 7.2891F, 11.0936F, new CubeDeformation(0.0F)).texOffs(114, -41)
						.addBox(-6.7275F, -3.4102F, -2.6667F, 13.455F, 6.8203F, 5.3334F, new CubeDeformation(0.0F)).texOffs(-240, 22).addBox(-1.9785F, -3.3984F, -6.9668F, 3.957F, 6.7969F, 13.9336F, new CubeDeformation(0.0F)).texOffs(98, 0)
						.addBox(-5.4155F, -3.3789F, -4.8224F, 10.8309F, 6.7578F, 9.6449F, new CubeDeformation(0.0F)).texOffs(10, -166).addBox(-7.1666F, -3.3594F, -1.1638F, 14.3332F, 6.7188F, 2.3276F, new CubeDeformation(0.0F)).texOffs(-110, -204)
						.addBox(-3.4394F, -3.3477F, -6.4003F, 6.8789F, 6.6953F, 12.8006F, new CubeDeformation(0.0F)).texOffs(-112, -166).addBox(-6.6712F, -3.1953F, -3.0472F, 13.3423F, 6.3906F, 6.0945F, new CubeDeformation(0.0F)).texOffs(8, -157)
						.addBox(-1.6418F, -3.1836F, -7.1532F, 3.2837F, 6.3672F, 14.3065F, new CubeDeformation(0.0F)).texOffs(-74, -166).addBox(-5.2307F, -3.1641F, -5.1603F, 10.4614F, 6.3281F, 10.3206F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-7.1913F, -3.1445F, -1.5483F, 14.3826F, 6.2891F, 3.0967F, new CubeDeformation(0.0F)).texOffs(-196, -85).addBox(-3.1488F, -3.1328F, -6.6536F, 6.2977F, 6.2656F, 13.3072F, new CubeDeformation(0.0F)).texOffs(74, 19)
						.addBox(-6.235F, -3.1133F, -3.9284F, 12.47F, 6.2266F, 7.8567F, new CubeDeformation(0.0F)).texOffs(23, 0).addBox(-0.6765F, -3.1016F, -7.3432F, 1.3531F, 6.2031F, 14.6864F, new CubeDeformation(0.0F)).texOffs(60, -192)
						.addBox(-6.8089F, -2.6328F, -3.2722F, 13.6178F, 5.2656F, 6.5444F, new CubeDeformation(0.0F)).texOffs(16, 20).addBox(-1.5468F, -2.6211F, -7.3985F, 3.0936F, 5.2422F, 14.7969F, new CubeDeformation(0.0F)).texOffs(-114, -86)
						.addBox(-5.2808F, -2.6016F, -5.4171F, 10.5616F, 5.2031F, 10.8342F, new CubeDeformation(0.0F)).texOffs(-158, -12).addBox(-7.3697F, -2.582F, -1.7379F, 14.7395F, 5.1641F, 3.4758F, new CubeDeformation(0.0F)).texOffs(-156, -120)
						.addBox(-3.1065F, -2.5703F, -6.9097F, 6.213F, 5.1406F, 13.8193F, new CubeDeformation(0.0F)).texOffs(6, -124).addBox(-6.3352F, -2.5508F, -4.1664F, 12.6704F, 5.1016F, 8.3327F, new CubeDeformation(0.0F)).texOffs(74, -167)
						.addBox(-0.5485F, -2.5391F, -7.5665F, 1.0969F, 5.0781F, 15.1331F, new CubeDeformation(0.0F)).texOffs(46, -17).addBox(-7.5881F, -2.5313F, -0.1152F, 15.1762F, 5.0625F, 0.2304F, new CubeDeformation(0.0F)).texOffs(-198, -204)
						.addBox(-4.5278F, -2.5195F, -6.0952F, 9.0556F, 5.0391F, 12.1903F, new CubeDeformation(0.0F)).texOffs(-196, -66).addBox(-7.0978F, -2.5F, -2.7149F, 14.1957F, 5.0F, 5.4298F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.1651F, -2.4883F, -7.2884F, 4.3303F, 4.9766F, 14.5768F, new CubeDeformation(0.0F)).texOffs(-202, -20).addBox(-5.7435F, -2.4688F, -4.9917F, 11.4871F, 4.9375F, 9.9834F, new CubeDeformation(0.0F)).texOffs(60, 12)
						.addBox(-7.5316F, -2.4492F, -1.13F, 15.0631F, 4.8984F, 2.26F, new CubeDeformation(0.0F)).texOffs(-240, -153).addBox(-3.6875F, -2.4375F, -6.6679F, 7.3751F, 4.875F, 13.3358F, new CubeDeformation(0.0F)).texOffs(92, -126)
						.addBox(-7.0115F, -2.2852F, -3.101F, 14.0231F, 4.5703F, 6.2021F, new CubeDeformation(0.0F)).texOffs(-204, 30).addBox(-1.8059F, -2.2734F, -7.4545F, 3.6118F, 4.5469F, 14.9091F, new CubeDeformation(0.0F)).texOffs(-120, -69)
						.addBox(-5.529F, -2.2539F, -5.3245F, 11.0579F, 4.5078F, 10.649F, new CubeDeformation(0.0F)).texOffs(-26, -179).addBox(-7.5285F, -2.2344F, -1.5262F, 15.057F, 4.4688F, 3.0524F, new CubeDeformation(0.0F)).texOffs(-156, -154)
						.addBox(-3.3709F, -2.2227F, -6.9063F, 6.7419F, 4.4453F, 13.8125F, new CubeDeformation(0.0F)).texOffs(18, 22).addBox(-6.5558F, -2.2031F, -4.0209F, 13.1117F, 4.4063F, 8.0417F, new CubeDeformation(0.0F)).texOffs(19, 18)
						.addBox(-0.7982F, -2.1914F, -7.6525F, 1.5964F, 4.3828F, 15.305F, new CubeDeformation(0.0F)).texOffs(-196, -187).addBox(-4.7842F, -2.1719F, -6.0327F, 9.5685F, 4.3438F, 12.0655F, new CubeDeformation(0.0F)).texOffs(42, 9)
						.addBox(-7.2798F, -2.1523F, -2.5241F, 14.5597F, 4.3047F, 5.0482F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-2.4272F, -2.1406F, -7.3162F, 4.8545F, 4.2813F, 14.6323F, new CubeDeformation(0.0F)).texOffs(-202, -20)
						.addBox(-5.979F, -2.1211F, -4.8737F, 11.9579F, 4.2422F, 9.7474F, new CubeDeformation(0.0F)).texOffs(174, -141).addBox(-7.6659F, -2.1016F, -0.9038F, 15.3319F, 4.2031F, 1.8075F, new CubeDeformation(0.0F)).texOffs(-240, -153)
						.addBox(-3.9487F, -2.0898F, -6.6363F, 7.8973F, 4.1797F, 13.2726F, new CubeDeformation(0.0F)).texOffs(76, -93).addBox(-6.8983F, -2.0703F, -3.4824F, 13.7966F, 4.1406F, 6.9649F, new CubeDeformation(0.0F)).texOffs(-204, 71)
						.addBox(-1.4341F, -2.0586F, -7.5964F, 2.8682F, 4.1172F, 15.1928F, new CubeDeformation(0.0F)).texOffs(-156, -136).addBox(-5.2908F, -2.0391F, -5.6436F, 10.5816F, 4.0781F, 11.2871F, new CubeDeformation(0.0F)).texOffs(50, 10)
						.addBox(-7.4982F, -2.0195F, -1.9233F, 14.9963F, 4.0391F, 3.8467F, new CubeDeformation(0.0F)).texOffs(-114, -154).addBox(-3.037F, -2.0078F, -7.1236F, 6.074F, 4.0156F, 14.2472F, new CubeDeformation(0.0F)).texOffs(10, -179)
						.addBox(-6.39F, -1.9883F, -4.3834F, 12.7801F, 3.9766F, 8.7667F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(-0.4095F, -1.9766F, -7.7412F, 0.8189F, 3.9531F, 15.4823F, new CubeDeformation(0.0F)).texOffs(-156, -204)
						.addBox(-5.0302F, -1.8242F, -5.9472F, 10.0604F, 3.6484F, 11.8944F, new CubeDeformation(0.0F)).texOffs(134, -144).addBox(-7.4406F, -1.8047F, -2.3195F, 14.8813F, 3.6094F, 4.6389F, new CubeDeformation(0.0F)).texOffs(-120, -39)
						.addBox(-2.6874F, -1.793F, -7.3187F, 5.3748F, 3.5859F, 14.6374F, new CubeDeformation(0.0F)).texOffs(-22, -137).addBox(-6.1992F, -1.7734F, -4.7355F, 12.3984F, 3.5469F, 9.471F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-0.0137F, -1.7617F, -7.8036F, 0.0275F, 3.5234F, 15.6072F, new CubeDeformation(0.0F)).texOffs(60, 35).addBox(-7.7767F, -1.7539F, -0.6687F, 15.5533F, 3.5078F, 1.3374F, new CubeDeformation(0.0F)).texOffs(-240, -169)
						.addBox(-4.2024F, -1.7422F, -6.5807F, 8.4047F, 3.4844F, 13.1613F, new CubeDeformation(0.0F)).texOffs(-240, -186).addBox(-4.7486F, -1.6094F, -6.2339F, 9.4972F, 3.2188F, 12.4677F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(-7.3563F, -1.5898F, -2.7125F, 14.7125F, 3.1797F, 5.4251F, new CubeDeformation(0.0F)).texOffs(27, 1).addBox(-2.3239F, -1.5781F, -7.4906F, 4.6477F, 3.1563F, 14.9812F, new CubeDeformation(0.0F)).texOffs(-74, -150)
						.addBox(-5.9842F, -1.5586F, -5.0755F, 11.9684F, 3.1172F, 10.1509F, new CubeDeformation(0.0F)).texOffs(10, -30).addBox(-7.7772F, -1.5391F, -1.0711F, 15.5543F, 3.0781F, 2.1422F, new CubeDeformation(0.0F)).texOffs(-198, -135)
						.addBox(-3.883F, -1.5273F, -6.8256F, 7.766F, 3.0547F, 13.6513F, new CubeDeformation(0.0F)).texOffs(54, -204).addBox(-6.9432F, -1.5078F, -3.6768F, 13.8863F, 3.0156F, 7.3536F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-1.3069F, -1.4961F, -7.7494F, 2.6139F, 2.9922F, 15.4989F, new CubeDeformation(0.0F)).texOffs(-158, -101).addBox(-5.2645F, -1.4766F, -5.8399F, 10.5291F, 2.9531F, 11.6798F, new CubeDeformation(0.0F)).texOffs(48, 19)
						.addBox(-7.5799F, -1.457F, -2.1028F, 15.1599F, 2.9141F, 4.2056F, new CubeDeformation(0.0F)).texOffs(-80, -35).addBox(-5.7461F, -1.3438F, -5.4016F, 11.4921F, 2.6875F, 10.8031F, new CubeDeformation(0.0F)).texOffs(58, 35)
						.addBox(-7.7507F, -1.3242F, -1.4742F, 15.5014F, 2.6484F, 2.9483F, new CubeDeformation(0.0F)).texOffs(174, -145).addBox(-7.867F, -1.1914F, -0.8314F, 15.734F, 2.3828F, 1.6628F, new CubeDeformation(0.0F)).texOffs(-200, -151)
						.addBox(-4.1277F, -1.1797F, -6.7506F, 8.2554F, 2.3594F, 13.5012F, new CubeDeformation(0.0F)).texOffs(18, 30).addBox(-7.1086F, -1.1602F, -3.4817F, 14.2172F, 2.3203F, 6.9633F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(-1.5624F, -1.1484F, -7.7614F, 3.1248F, 2.2969F, 15.5229F, new CubeDeformation(0.0F)).texOffs(-158, -101).addBox(-5.486F, -1.1289F, -5.7122F, 10.9721F, 2.2578F, 11.4244F, new CubeDeformation(0.0F)).texOffs(150, -35)
						.addBox(-7.6974F, -1.1094F, -1.8758F, 15.3949F, 2.2188F, 3.7517F, new CubeDeformation(0.0F)).texOffs(-76, -122).addBox(-3.1954F, -1.0977F, -7.2515F, 6.3908F, 2.1953F, 14.503F, new CubeDeformation(0.0F)).texOffs(48, -126)
						.addBox(-6.5905F, -1.0781F, -4.4049F, 13.1809F, 2.1563F, 8.8098F, new CubeDeformation(0.0F)).texOffs(58, 19).addBox(-0.5143F, -1.0664F, -7.9119F, 1.0285F, 2.1328F, 15.8238F, new CubeDeformation(0.0F)).texOffs(174, -40)
						.addBox(-7.9276F, -1.0586F, -0.1794F, 15.8552F, 2.1172F, 0.3589F, new CubeDeformation(0.0F)).texOffs(-200, -117).addBox(-4.682F, -1.0469F, -6.4018F, 9.364F, 2.0938F, 12.8036F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(-7.3888F, -1.0273F, -2.8895F, 14.7777F, 2.0547F, 5.7791F, new CubeDeformation(0.0F)).texOffs(52, 20).addBox(-2.2029F, -1.0156F, -7.6234F, 4.4059F, 2.0313F, 15.2467F, new CubeDeformation(0.0F)).texOffs(-36, -35)
						.addBox(-5.9523F, -0.9961F, -5.2515F, 11.9045F, 1.9922F, 10.503F, new CubeDeformation(0.0F)).texOffs(134, -135).addBox(-7.8433F, -0.9766F, -1.2366F, 15.6866F, 1.9531F, 2.4732F, new CubeDeformation(0.0F)).texOffs(-240, -85)
						.addBox(-3.7915F, -0.9648F, -6.9781F, 7.5829F, 1.9297F, 13.9562F, new CubeDeformation(0.0F)).texOffs(60, 25).addBox(-6.9465F, -0.9453F, -3.854F, 13.8929F, 1.8906F, 7.7079F, new CubeDeformation(0.0F)).texOffs(41, 29)
						.addBox(-7.716F, -0.5469F, -2.0406F, 15.432F, 1.0938F, 4.0813F, new CubeDeformation(0.0F)).texOffs(-76, -51).addBox(-3.0756F, -0.5352F, -7.3658F, 6.1511F, 1.0703F, 14.7315F, new CubeDeformation(0.0F)).texOffs(24, 14)
						.addBox(-6.5495F, -0.5156F, -4.5649F, 13.099F, 1.0313F, 9.1298F, new CubeDeformation(0.0F)).texOffs(15, 9).addBox(-0.3623F, -0.5039F, -7.9759F, 0.7246F, 1.0078F, 15.9518F, new CubeDeformation(0.0F)).texOffs(-114, -122)
						.addBox(-7.9775F, -0.4961F, -0.3364F, 15.955F, 0.9922F, 0.6728F, new CubeDeformation(0.0F)).texOffs(-120, -53).addBox(-4.5873F, -0.4844F, -6.5362F, 9.1745F, 0.9688F, 13.0725F, new CubeDeformation(0.0F)).texOffs(114, -29)
						.addBox(-7.3798F, -0.4648F, -3.0533F, 14.7596F, 0.9297F, 6.1066F, new CubeDeformation(0.0F)).texOffs(16, -204).addBox(-2.0672F, -0.4531F, -7.715F, 4.1344F, 0.9063F, 15.43F, new CubeDeformation(0.0F)).texOffs(-26, -92)
						.addBox(-5.8859F, -0.4336F, -5.4008F, 11.7718F, 0.8672F, 10.8016F, new CubeDeformation(0.0F)).texOffs(140, -156).addBox(-7.866F, -0.4141F, -1.398F, 15.732F, 0.8281F, 2.796F, new CubeDeformation(0.0F)).texOffs(-202, -35)
						.addBox(-3.6768F, -0.4023F, -7.0936F, 7.3536F, 0.8047F, 14.1872F, new CubeDeformation(0.0F)).texOffs(76, -82).addBox(-6.9105F, -0.3828F, -4.0123F, 13.821F, 0.7656F, 8.0246F, new CubeDeformation(0.0F)).texOffs(91, 5)
						.addBox(-1.0205F, -0.3711F, -7.926F, 2.041F, 0.7422F, 15.8519F, new CubeDeformation(0.0F)).texOffs(-70, -185).addBox(-5.1157F, -0.3516F, -6.1405F, 10.2314F, 0.7031F, 12.281F, new CubeDeformation(0.0F)).texOffs(140, 161)
						.addBox(-7.613F, -0.332F, -2.4356F, 15.226F, 0.6641F, 4.8712F, new CubeDeformation(0.0F)).texOffs(21, 20).addBox(-2.6993F, -0.3203F, -7.524F, 5.3986F, 0.6406F, 15.0481F, new CubeDeformation(0.0F)).texOffs(20, -137)
						.addBox(-6.3165F, -0.3008F, -4.9001F, 12.633F, 0.6016F, 9.8002F, new CubeDeformation(0.0F)).texOffs(-196, -171).addBox(-7.9603F, -0.2813F, -0.7443F, 15.9207F, 0.5625F, 1.4886F, new CubeDeformation(0.0F)).texOffs(-72, -87)
						.addBox(-4.2529F, -0.2695F, -6.7705F, 8.5058F, 0.5391F, 13.5411F, new CubeDeformation(0.0F)).texOffs(114, -29).addBox(-7.2229F, -0.25F, -3.4303F, 14.4458F, 0.5F, 6.8606F, new CubeDeformation(0.0F)).texOffs(46, -72)
						.addBox(-1.6725F, -0.2383F, -7.8196F, 3.345F, 0.4766F, 15.6392F, new CubeDeformation(0.0F)).texOffs(-32, -204).addBox(-5.6086F, -0.2188F, -5.7005F, 11.2171F, 0.4375F, 11.4011F, new CubeDeformation(0.0F)).texOffs(-34, -39)
						.addBox(-7.7924F, -0.1992F, -1.7997F, 15.5848F, 0.3984F, 3.5994F, new CubeDeformation(0.0F)).texOffs(-34, -172).addBox(-3.3131F, -0.1875F, -7.2793F, 6.6261F, 0.375F, 14.5586F, new CubeDeformation(0.0F)).texOffs(76, -82)
						.addBox(-6.7028F, -0.168F, -4.364F, 13.4056F, 0.3359F, 8.728F, new CubeDeformation(0.0F)).texOffs(84, -65).addBox(-7.0417F, -0.0352F, -3.7965F, 14.0834F, 0.0703F, 7.5929F, new CubeDeformation(0.0F)).texOffs(91, 5)
						.addBox(-1.2716F, -0.0234F, -7.8983F, 2.5431F, 0.0469F, 15.7965F, new CubeDeformation(0.0F)).texOffs(-34, -51).addBox(-5.3121F, -0.0039F, -5.9817F, 10.6243F, 0.0078F, 11.9635F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 16.0F, 0.0F));
		PartDefinition face = sphere.addOrReplaceChild("face", CubeListBuilder.create().texOffs(45, 93).addBox(-8.0F, -7.0F, 1.0F, 18.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -9.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sphere.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}