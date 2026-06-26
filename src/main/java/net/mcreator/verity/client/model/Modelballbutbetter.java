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
public class Modelballbutbetter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("verity", "modelballbutbetter"), "main");
	public final ModelPart sphere;

	public Modelballbutbetter(ModelPart root) {
		this.sphere = root.getChild("sphere");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition sphere = partdefinition.addOrReplaceChild("sphere",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.1699F, -2.9951F, -0.0149F, 0.3399F, 5.9903F, 0.0298F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1447F, -2.9879F, -0.2274F, 0.2894F, 5.9757F, 0.4549F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-0.3449F, -2.9757F, -0.1614F, 0.6899F, 5.9515F, 0.3228F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.0932F, -2.9684F, -0.4238F, 0.1864F, 5.9369F, 0.8477F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.3598F, -2.9563F, -0.3616F, 0.7197F, 5.9126F, 0.7232F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.562F, -2.9442F, -0.1264F, 1.124F, 5.8883F, 0.2529F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.2567F, -2.9369F, -0.5556F, 0.5135F, 5.8738F, 1.1113F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5616F, -2.9248F, -0.3611F, 1.1232F, 5.8495F, 0.7222F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0577F, -2.9175F, -0.6964F, 0.1154F, 5.835F, 1.3928F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7188F, -2.9126F, -0.0035F, 1.4375F, 5.8252F, 0.007F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.452F, -2.9053F, -0.5956F, 0.904F, 5.8107F, 1.1911F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7439F, -2.8932F, -0.2758F, 1.4877F, 5.7864F, 0.5515F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.2414F, -2.8859F, -0.7831F, 0.4828F, 5.7718F, 1.5661F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.6557F, -2.8738F, -0.5581F, 1.3113F, 5.7476F, 1.1162F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8919F, -2.8617F, -0.1244F, 1.7838F, 5.7233F, 0.2489F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.4552F, -2.8544F, -0.8034F, 0.9103F, 5.7087F, 1.6067F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8476F, -2.8422F, -0.4508F, 1.6953F, 5.6845F, 0.9016F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1615F, -2.835F, -0.968F, 0.323F, 5.6699F, 1.9359F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6788F, -2.8228F, -0.7556F, 1.3576F, 5.6456F, 1.5113F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0102F, -2.8107F, -0.2821F, 2.0204F, 5.6214F, 0.5643F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.3979F, -2.8034F, -0.9913F, 0.7958F, 5.6068F, 1.9826F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.8932F, -2.7913F, -0.6411F, 1.7865F, 5.5825F, 1.2822F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0353F, -2.784F, -1.1172F, 0.0706F, 5.568F, 2.2345F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.128F, -2.7791F, -0.0632F, 2.2561F, 5.5583F, 0.1264F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6462F, -2.7718F, -0.9483F, 1.2924F, 5.5437F, 1.8967F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0808F, -2.7597F, -0.4647F, 2.1615F, 5.5194F, 0.9295F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.2929F, -2.7524F, -1.1569F, 0.5858F, 5.5049F, 2.3137F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.8881F, -2.7403F, -0.8378F, 1.7763F, 5.4806F, 1.6757F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.2255F, -2.7282F, -0.2353F, 2.451F, 5.4563F, 0.4706F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.566F, -2.7209F, -1.1298F, 1.1319F, 5.4417F, 2.2597F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.1061F, -2.7087F, -0.6628F, 2.2122F, 5.4175F, 1.3256F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1487F, -2.7015F, -1.2962F, 0.2974F, 5.4029F, 2.5923F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8368F, -2.6893F, -1.0331F, 1.6736F, 5.3786F, 2.0662F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.2836F, -2.6772F, -0.4303F, 2.5671F, 5.3544F, 0.8606F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4441F, -2.6699F, -1.294F, 0.8883F, 5.3398F, 2.5879F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0876F, -2.6578F, -0.868F, 2.1751F, 5.3155F, 1.7361F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4063F, -2.6456F, -0.1511F, 2.8127F, 5.2913F, 0.3023F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7428F, -2.6383F, -1.2196F, 1.4856F, 5.2767F, 2.4392F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3012F, -2.6262F, -0.6402F, 2.6025F, 5.2524F, 1.2803F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2863F, -2.6189F, -1.435F, 0.5725F, 5.2379F, 2.87F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0266F, -2.6068F, -1.0727F, 2.0532F, 5.2136F, 2.1454F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.4625F, -2.5947F, -0.3591F, 2.9249F, 5.1893F, 0.7182F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6098F, -2.5874F, -1.3905F, 1.2197F, 5.1748F, 2.7811F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.2779F, -2.5752F, -0.8574F, 2.5558F, 5.1505F, 1.7148F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0979F, -2.568F, -1.5479F, 0.1957F, 5.1359F, 3.0958F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5585F, -2.5631F, -0.038F, 3.1171F, 5.1262F, 0.076F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9251F, -2.5558F, -1.2696F, 1.8502F, 5.1117F, 2.5392F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.4802F, -2.5437F, -0.5819F, 2.9605F, 5.0874F, 1.1637F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4421F, -2.5364F, -1.5399F, 0.8841F, 5.0728F, 3.0798F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.2137F, -2.5243F, -1.0747F, 2.4275F, 5.0485F, 2.1493F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6194F, -2.5121F, -0.2582F, 3.2388F, 5.0243F, 0.5165F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7856F, -2.5049F, -1.452F, 1.5713F, 5.0097F, 2.9041F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4582F, -2.4927F, -0.8124F, 2.9164F, 4.9854F, 1.6248F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2441F, -2.4854F, -1.6622F, 0.4882F, 4.9709F, 3.3245F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.1098F, -2.4733F, -1.285F, 2.2195F, 4.9466F, 2.57F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6429F, -2.4612F, -0.4936F, 3.2857F, 4.9223F, 0.9872F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6115F, -2.4539F, -1.6138F, 1.2231F, 4.9078F, 3.2277F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.3959F, -2.4417F, -1.0437F, 2.7918F, 4.8835F, 2.0874F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0211F, -2.4345F, -1.753F, 0.0423F, 4.8689F, 3.506F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7548F, -2.4296F, -0.1327F, 3.5096F, 4.8592F, 0.2654F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9679F, -2.4223F, -1.4817F, 1.9357F, 4.8447F, 2.9635F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6269F, -2.4102F, -0.7376F, 3.2539F, 4.8204F, 1.4751F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4068F, -2.4029F, -1.7494F, 0.8136F, 4.8058F, 3.4989F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.2937F, -2.3908F, -1.2691F, 2.5874F, 4.7816F, 2.5381F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.7883F, -2.3786F, -0.3797F, 3.5765F, 4.7573F, 0.7594F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7908F, -2.3714F, -1.6587F, 1.5816F, 4.7427F, 3.3174F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5707F, -2.3592F, -0.9834F, 3.1414F, 4.7184F, 1.9667F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1761F, -2.3519F, -1.854F, 0.3523F, 4.7039F, 3.708F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.1531F, -2.3398F, -1.4818F, 2.3061F, 4.6796F, 2.9636F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7824F, -2.3277F, -0.6364F, 3.5648F, 4.6553F, 1.2729F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5821F, -2.3204F, -1.8102F, 1.1642F, 4.6408F, 3.6205F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.4741F, -2.3083F, -1.2244F, 2.9482F, 4.6165F, 2.4487F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.9153F, -2.2961F, -0.2437F, 3.8306F, 4.5922F, 0.4874F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.9763F, -2.2888F, -1.6757F, 1.9526F, 4.5777F, 3.3515F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.7358F, -2.2767F, -0.8964F, 3.4716F, 4.5534F, 1.7929F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.3462F, -2.2694F, -1.9313F, 0.6924F, 4.5388F, 3.8626F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3381F, -2.2573F, -1.454F, 2.6763F, 4.5146F, 2.908F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9228F, -2.2451F, -0.5121F, 3.8455F, 4.4903F, 1.0243F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.7666F, -2.2379F, -1.8451F, 1.5332F, 4.4757F, 3.6901F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6482F, -2.2257F, -1.1531F, 3.2964F, 4.4515F, 2.3062F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0881F, -2.2184F, -2.0176F, 0.1762F, 4.4369F, 4.0352F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0229F, -2.2136F, -0.0889F, 4.0458F, 4.4272F, 0.1777F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.1648F, -2.2063F, -1.666F, 2.3297F, 4.4126F, 3.3319F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8891F, -2.1942F, -0.7855F, 3.7782F, 4.3883F, 1.571F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.528F, -2.1869F, -1.9846F, 1.0561F, 4.3738F, 3.9692F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5202F, -2.1748F, -1.3998F, 3.0403F, 4.3495F, 2.7996F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0465F, -2.1626F, -0.3674F, 4.093F, 4.3252F, 0.7349F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.957F, -2.1553F, -1.8544F, 1.914F, 4.3107F, 3.7087F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.8135F, -2.1432F, -1.0572F, 3.6271F, 4.2864F, 2.1145F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2653F, -2.1359F, -2.0898F, 0.5307F, 4.2718F, 4.1797F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3534F, -2.1238F, -1.6303F, 2.7067F, 4.2476F, 3.2606F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0285F, -2.1117F, -0.6529F, 4.0569F, 4.2233F, 1.3058F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.7185F, -2.1044F, -2.0138F, 1.4369F, 4.2087F, 4.0276F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6965F, -2.0922F, -1.3208F, 3.3929F, 4.1845F, 2.6417F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.152F, -2.0801F, -0.205F, 4.304F, 4.1602F, 0.4101F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.1503F, -2.0728F, -1.8385F, 2.3007F, 4.1456F, 3.677F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.9678F, -2.0607F, -0.9388F, 3.9356F, 4.1214F, 1.8776F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.4537F, -2.0534F, -2.1396F, 0.9074F, 4.1068F, 4.2791F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5391F, -2.0413F, -1.5699F, 3.0782F, 4.0825F, 3.1397F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.1521F, -2.0291F, -0.501F, 4.3042F, 4.0583F, 1.0021F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9146F, -2.0218F, -2.0188F, 1.8291F, 4.0437F, 4.0377F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8645F, -2.0097F, -1.2186F, 3.7289F, 4.0194F, 2.4371F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.1678F, -2.0024F, -2.2276F, 0.3357F, 4.0049F, 4.4552F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.2381F, -1.9976F, -0.0276F, 4.4761F, 3.9951F, 0.0552F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3437F, -1.9903F, -1.7981F, 2.6874F, 3.9806F, 3.5962F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.1089F, -1.9782F, -0.7998F, 4.2177F, 3.9563F, 1.5995F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6502F, -1.9709F, -2.1663F, 1.3005F, 3.9417F, 4.3326F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7193F, -1.9587F, -1.4857F, 3.4386F, 3.9175F, 2.9714F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2584F, -1.9466F, -0.3323F, 4.5168F, 3.8932F, 0.6645F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.1134F, -1.9393F, -1.9998F, 2.2268F, 3.8786F, 3.9997F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0218F, -1.9272F, -1.0946F, 4.0436F, 3.8544F, 2.1893F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.3624F, -1.9199F, -2.2765F, 0.7248F, 3.8398F, 4.5531F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5343F, -1.9078F, -1.7339F, 3.0686F, 3.8155F, 3.4677F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.2348F, -1.8956F, -0.6422F, 4.4695F, 3.7913F, 1.2844F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8522F, -1.8883F, -2.1698F, 1.7045F, 3.7767F, 4.3395F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8916F, -1.8762F, -1.3791F, 3.7831F, 3.7524F, 2.7582F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0566F, -1.8689F, -2.346F, 0.1132F, 3.7379F, 4.6921F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.3458F, -1.8641F, -0.149F, 4.6917F, 3.7282F, 0.2979F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3123F, -1.8568F, -1.9571F, 2.6246F, 3.7136F, 3.9142F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.1664F, -1.8447F, -0.9508F, 4.3328F, 3.6893F, 1.9016F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5649F, -1.8374F, -2.3032F, 1.1298F, 3.6748F, 4.6065F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7196F, -1.8252F, -1.6466F, 3.4392F, 3.6505F, 3.2933F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.3438F, -1.8131F, -0.4682F, 4.6876F, 3.6262F, 0.9364F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0569F, -1.8058F, -2.1499F, 2.1139F, 3.6117F, 4.2997F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0534F, -1.7937F, -1.2514F, 4.1069F, 3.5874F, 2.5028F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2569F, -1.7864F, -2.3964F, 0.5137F, 3.5728F, 4.7928F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5085F, -1.7743F, -1.8911F, 3.0171F, 3.5485F, 3.7822F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.2962F, -1.7621F, -0.7888F, 4.5924F, 3.5243F, 1.5777F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.7728F, -1.7549F, -2.3072F, 1.5455F, 3.5097F, 4.6145F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8971F, -1.7427F, -1.5375F, 3.7943F, 3.4854F, 3.0749F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.4345F, -1.7306F, -0.28F, 4.869F, 3.4612F, 0.56F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.2617F, -1.7233F, -2.1068F, 2.5233F, 3.4466F, 4.2135F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2029F, -1.7112F, -1.1042F, 4.4057F, 3.4223F, 2.2084F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.465F, -1.7039F, -2.425F, 0.9299F, 3.4078F, 4.85F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6996F, -1.6917F, -1.8026F, 3.3992F, 3.3835F, 3.6052F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.4095F, -1.6796F, -0.6108F, 4.8191F, 3.3592F, 1.2215F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9833F, -1.6723F, -2.2883F, 1.9666F, 3.3447F, 4.5767F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0646F, -1.6602F, -1.4076F, 4.1291F, 3.3204F, 2.8152F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.1394F, -1.6529F, -2.4997F, 0.2787F, 3.3058F, 4.9994F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5055F, -1.6481F, -0.0798F, 5.011F, 3.2961F, 0.1596F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4639F, -1.6408F, -2.0408F, 2.9278F, 3.2816F, 4.0816F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.3378F, -1.6286F, -0.9392F, 4.6757F, 3.2573F, 1.8783F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6784F, -1.6214F, -2.4313F, 1.3567F, 3.2427F, 4.8625F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8831F, -1.6092F, -1.6925F, 3.7661F, 3.2184F, 3.3849F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5048F, -1.5971F, -0.4186F, 5.0096F, 3.1942F, 0.8372F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.194F, -1.5898F, -2.2466F, 2.3879F, 3.1796F, 4.4931F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2198F, -1.5777F, -1.2584F, 4.4395F, 3.1553F, 2.5168F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.3525F, -1.5704F, -2.5317F, 0.705F, 3.1408F, 5.0634F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6611F, -1.5583F, -1.9526F, 3.3222F, 3.1165F, 3.9052F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.4566F, -1.5461F, -0.7581F, 4.9132F, 3.0922F, 1.5162F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8945F, -1.5388F, -2.4149F, 1.7891F, 3.0777F, 4.8298F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0567F, -1.5267F, -1.5618F, 4.1133F, 3.0534F, 3.1236F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0119F, -1.5194F, -2.5867F, 0.0238F, 3.0388F, 5.1735F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5807F, -1.5146F, -0.2145F, 5.1614F, 3.0291F, 0.429F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4023F, -1.5073F, -2.1822F, 2.8045F, 3.0146F, 4.3643F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.3607F, -1.4951F, -1.0915F, 4.7215F, 2.9903F, 2.183F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5711F, -1.4879F, -2.5417F, 1.1421F, 2.9757F, 5.0834F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8509F, -1.4757F, -1.8429F, 3.7018F, 2.9515F, 3.6858F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5575F, -1.4636F, -0.563F, 5.1151F, 2.9272F, 1.126F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.111F, -1.4563F, -2.3759F, 2.222F, 2.9126F, 4.7518F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2183F, -1.4442F, -1.4119F, 4.4366F, 2.8883F, 2.8239F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2295F, -1.4369F, -2.6235F, 0.459F, 2.8738F, 5.247F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.6361F, -1.432F, -0.0007F, 5.2723F, 2.8641F, 0.0014F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6058F, -1.4248F, -2.0956F, 3.2115F, 2.8495F, 4.1912F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.4858F, -1.4126F, -0.9086F, 4.9715F, 2.8252F, 1.8171F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7926F, -1.4053F, -2.5292F, 1.5851F, 2.8107F, 5.0584F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0311F, -1.3932F, -1.7128F, 4.0622F, 2.7864F, 3.4255F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6393F, -1.3811F, -0.3558F, 5.2786F, 2.7621F, 0.7117F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3253F, -1.3738F, -2.3144F, 2.6507F, 2.7476F, 4.6287F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.3659F, -1.3617F, -1.2443F, 4.7319F, 2.7233F, 2.4886F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4527F, -1.3544F, -2.6383F, 0.9054F, 2.7087F, 5.2767F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8021F, -1.3422F, -1.9877F, 3.6042F, 2.6845F, 3.9753F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5932F, -1.3301F, -0.7114F, 5.1864F, 2.6602F, 1.4229F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0146F, -1.3228F, -2.4942F, 2.0291F, 2.6456F, 4.9883F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1995F, -1.3107F, -1.5634F, 4.3991F, 2.6214F, 3.1267F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.0977F, -1.3034F, -2.7003F, 0.1955F, 2.6068F, 5.4006F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7008F, -1.2985F, -0.1388F, 5.4017F, 2.5971F, 0.2777F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5351F, -1.2913F, -2.2307F, 3.0702F, 2.5825F, 4.4615F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.4978F, -1.2791F, -1.0605F, 4.9957F, 2.5583F, 2.121F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.679F, -1.2718F, -2.6309F, 1.358F, 2.5437F, 5.2617F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.9891F, -1.2597F, -1.8592F, 3.9782F, 2.5194F, 3.7184F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6817F, -1.2476F, -0.5021F, 5.3634F, 2.4951F, 1.0043F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.2346F, -1.2403F, -2.4367F, 2.4693F, 2.4806F, 4.8733F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.3543F, -1.2282F, -1.3961F, 4.7085F, 2.4563F, 2.7921F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.3249F, -1.2209F, -2.721F, 0.6498F, 2.4417F, 5.442F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.738F, -1.2087F, -2.1256F, 3.476F, 2.4175F, 4.2513F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.6124F, -1.1966F, -0.8624F, 5.2247F, 2.3932F, 1.7247F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.9061F, -1.1893F, -2.6009F, 1.8122F, 2.3786F, 5.2017F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1646F, -1.1772F, -1.7114F, 4.3292F, 2.3544F, 3.4228F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.75F, -1.165F, -0.2827F, 5.5001F, 2.3301F, 0.5654F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4505F, -1.1578F, -2.3571F, 2.9009F, 2.3155F, 4.7141F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.4935F, -1.1456F, -1.2125F, 4.987F, 2.2913F, 2.425F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5555F, -1.1383F, -2.7195F, 1.111F, 2.2767F, 5.439F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9318F, -1.1262F, -2.0F, 3.8635F, 2.2524F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7081F, -1.1141F, -0.6518F, 5.4163F, 2.2282F, 1.3036F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.1316F, -1.1068F, -2.5484F, 2.2633F, 2.2136F, 5.0968F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.3266F, -1.0947F, -1.5455F, 4.6532F, 2.1893F, 3.091F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1893F, -1.0874F, -2.7896F, 0.3786F, 2.1748F, 5.5792F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7973F, -1.0825F, -0.0554F, 5.5947F, 2.165F, 0.1107F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6597F, -1.0752F, -2.2559F, 3.3195F, 2.1505F, 4.5118F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.6155F, -1.0631F, -1.0143F, 5.2311F, 2.1262F, 2.0286F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7872F, -1.0558F, -2.6955F, 1.5745F, 2.1117F, 5.3909F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1144F, -1.0437F, -1.8548F, 4.2287F, 2.0874F, 3.7095F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.7839F, -1.0316F, -0.4308F, 5.5679F, 2.0631F, 0.8616F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3532F, -1.0243F, -2.4738F, 2.7065F, 2.0485F, 4.9476F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.4734F, -1.0121F, -1.3631F, 4.9468F, 2.0243F, 2.7261F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4236F, -1.0049F, -2.7948F, 0.8471F, 2.0097F, 5.5896F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8602F, -0.9927F, -2.134F, 3.7205F, 1.9854F, 4.268F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.719F, -0.9806F, -0.8033F, 5.4381F, 1.9612F, 1.6067F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0177F, -0.9733F, -2.6489F, 2.0355F, 1.9466F, 5.2979F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2838F, -0.9612F, -1.6913F, 4.5676F, 1.9223F, 3.3825F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.0474F, -0.9539F, -2.8439F, 0.0948F, 1.9078F, 5.6878F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.8388F, -0.949F, -0.2015F, 5.6776F, 1.8981F, 0.4031F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5686F, -0.9417F, -2.3775F, 3.1373F, 1.8835F, 4.755F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.6033F, -0.9296F, -1.1657F, 5.2065F, 1.8592F, 2.3315F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.6593F, -0.9223F, -2.7775F, 1.3187F, 1.8447F, 5.555F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0499F, -0.9102F, -1.9924F, 4.0998F, 1.8204F, 3.9847F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.8027F, -0.8981F, -0.5816F, 5.6054F, 1.7961F, 1.1632F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.2447F, -0.8908F, -2.5802F, 2.4894F, 1.7816F, 5.1603F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.4383F, -0.8786F, -1.5109F, 4.8765F, 1.7573F, 3.0219F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.2847F, -0.8714F, -2.8565F, 0.5693F, 1.7427F, 5.713F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7756F, -0.8592F, -2.2603F, 3.5512F, 1.7184F, 4.5206F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7147F, -0.8471F, -0.9553F, 5.4295F, 1.6942F, 1.9106F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.8943F, -0.8398F, -2.7377F, 1.7886F, 1.6796F, 5.4754F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2267F, -0.8277F, -1.8322F, 4.4533F, 1.6553F, 3.6644F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.8656F, -0.8155F, -0.3512F, 5.7312F, 1.6311F, 0.7024F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4658F, -0.8083F, -2.4896F, 2.9317F, 1.6165F, 4.9792F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.576F, -0.7961F, -1.3154F, 5.1521F, 1.5922F, 2.6308F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5238F, -0.7888F, -2.8466F, 1.0477F, 1.5777F, 5.6933F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9721F, -0.7767F, -2.1231F, 3.9442F, 1.5534F, 4.2462F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.8066F, -0.7646F, -0.7337F, 5.6132F, 1.5291F, 1.4674F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.1261F, -0.7573F, -2.6755F, 2.2522F, 1.5146F, 5.351F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.3888F, -0.7452F, -1.6549F, 4.7775F, 1.4903F, 3.3097F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1402F, -0.7379F, -2.9045F, 0.2804F, 1.4757F, 5.8089F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.9068F, -0.733F, -0.1143F, 5.8137F, 1.466F, 0.2286F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.679F, -0.7257F, -2.3779F, 3.358F, 1.4515F, 4.7558F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.6957F, -0.7136F, -1.1063F, 5.3914F, 1.4272F, 2.2127F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7626F, -0.7063F, -2.8142F, 1.5253F, 1.4126F, 5.6283F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1561F, -0.6942F, -1.9671F, 4.3121F, 1.3883F, 3.9342F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.8778F, -0.682F, -0.503F, 5.7556F, 1.3641F, 1.006F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3526F, -0.6748F, -2.5914F, 2.7051F, 1.3495F, 5.1828F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5345F, -0.6626F, -1.4619F, 5.069F, 1.3252F, 2.9239F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.3821F, -0.6553F, -2.9025F, 0.7642F, 1.3107F, 5.805F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.882F, -0.6432F, -2.246F, 3.764F, 1.2864F, 4.4919F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7959F, -0.6311F, -0.8857F, 5.5919F, 1.2621F, 1.7715F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.9988F, -0.6238F, -2.7592F, 1.9975F, 1.2476F, 5.5185F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.3257F, -0.6117F, -1.7936F, 4.6514F, 1.2233F, 3.5872F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.9275F, -0.5995F, -0.2653F, 5.855F, 1.199F, 0.5306F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5714F, -0.5922F, -2.4859F, 3.1429F, 1.1845F, 4.9719F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6624F, -0.5801F, -1.2551F, 5.3247F, 1.1602F, 2.5102F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6241F, -0.5728F, -2.8779F, 1.2482F, 1.1456F, 5.7558F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0729F, -0.5607F, -2.0949F, 4.1458F, 1.1214F, 4.1899F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.8757F, -0.5485F, -0.6555F, 5.7513F, 1.0971F, 1.3111F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.23F, -0.5413F, -2.6822F, 2.46F, 1.0825F, 5.3644F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.4793F, -0.5291F, -1.6041F, 4.9585F, 1.0583F, 3.2083F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2355F, -0.5218F, -2.9449F, 0.4711F, 1.0437F, 5.8897F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.955F, -0.517F, -0.0228F, 5.9101F, 1.034F, 0.0457F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7806F, -0.5097F, -2.36F, 3.5612F, 1.0194F, 4.72F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.771F, -0.4976F, -1.0363F, 5.542F, 0.9951F, 2.0726F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.8639F, -0.4903F, -2.8308F, 1.7279F, 0.9806F, 5.6615F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2498F, -0.4782F, -1.9261F, 4.4996F, 0.9563F, 3.8521F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.934F, -0.466F, -0.4179F, 5.868F, 0.932F, 0.8357F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4541F, -0.4587F, -2.5836F, 2.9082F, 0.9175F, 5.1673F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6152F, -0.4466F, -1.4004F, 5.2305F, 0.8932F, 2.8008F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.48F, -0.4393F, -2.9286F, 0.9601F, 0.8786F, 5.8572F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9781F, -0.4272F, -2.2147F, 3.9561F, 0.8544F, 4.4293F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.8593F, -0.415F, -0.8074F, 5.7187F, 0.8301F, 1.6148F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0993F, -0.4078F, -2.7614F, 2.1987F, 0.8155F, 5.5228F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.411F, -0.3956F, -1.7408F, 4.822F, 0.7913F, 3.4817F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.0854F, -0.3883F, -2.9735F, 0.1709F, 0.7767F, 5.9471F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.9702F, -0.3835F, -0.1749F, 5.9405F, 0.767F, 0.3498F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6689F, -0.3762F, -2.4644F, 3.3379F, 0.7524F, 4.9287F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7323F, -0.3641F, -1.1841F, 5.4645F, 0.7282F, 2.3683F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.7229F, -0.3568F, -2.8897F, 1.4458F, 0.7136F, 5.7793F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1619F, -0.3447F, -2.0512F, 4.3239F, 0.6893F, 4.1023F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.9264F, -0.3325F, -0.5706F, 5.8528F, 0.665F, 1.1411F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.3281F, -0.3252F, -2.6703F, 2.6562F, 0.6505F, 5.3406F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5549F, -0.3131F, -1.5409F, 5.1098F, 0.6262F, 3.0818F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.3317F, -0.3058F, -2.9659F, 0.6635F, 0.6117F, 5.9318F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.8725F, -0.2937F, -2.3254F, 3.7451F, 0.5874F, 4.6508F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.8292F, -0.2816F, -0.9574F, 5.6583F, 0.5631F, 1.9148F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.9618F, -0.2743F, -2.8284F, 1.9236F, 0.5485F, 5.6567F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.3304F, -0.2621F, -1.8709F, 4.6609F, 0.5243F, 3.7418F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.9715F, -0.25F, -0.3279F, 5.9431F, 0.5F, 0.6558F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5481F, -0.2427F, -2.5582F, 3.0962F, 0.4854F, 5.1164F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6801F, -0.2306F, -1.328F, 5.3603F, 0.4612F, 2.6561F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5769F, -0.2233F, -2.9355F, 1.1538F, 0.4466F, 5.8711F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0629F, -0.2112F, -2.1679F, 4.1259F, 0.4223F, 4.3358F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.905F, -0.199F, -0.7221F, 5.81F, 0.3981F, 1.4442F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.1946F, -0.1917F, -2.7452F, 2.3892F, 0.3835F, 5.4904F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.482F, -0.1796F, -1.6755F, 4.964F, 0.3592F, 3.351F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.1805F, -0.1723F, -2.9896F, 0.361F, 0.3447F, 5.9792F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.9942F, -0.1675F, -0.0816F, 5.9884F, 0.335F, 0.1632F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.7573F, -0.1602F, -2.4262F, 3.5146F, 0.3204F, 4.8523F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7855F, -0.1481F, -1.1041F, 5.571F, 0.2961F, 2.2083F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.8187F, -0.1408F, -2.8827F, 1.6373F, 0.2816F, 5.7654F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.2384F, -0.1286F, -1.9933F, 4.4768F, 0.2573F, 3.9865F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.959F, -0.1165F, -0.4805F, 5.918F, 0.233F, 0.961F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.4192F, -0.1092F, -2.6408F, 2.8383F, 0.2184F, 5.2817F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6152F, -0.0971F, -1.4667F, 5.2304F, 0.1942F, 2.9335F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4272F, -0.0898F, -2.9681F, 0.8544F, 0.1796F, 5.9361F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9537F, -0.0777F, -2.2753F, 3.9075F, 0.1553F, 4.5506F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.87F, -0.0655F, -0.8712F, 5.7399F, 0.1311F, 1.7425F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0548F, -0.0583F, -2.8078F, 2.1097F, 0.1165F, 5.6157F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.3972F, -0.0461F, -1.8031F, 4.7945F, 0.0922F, 3.6062F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.0276F, -0.0388F, -2.9996F, 0.0553F, 0.0777F, 5.9992F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.9906F, -0.034F, -0.2347F, 5.9812F, 0.068F, 0.4694F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6334F, -0.0267F, -2.5162F, 3.2667F, 0.0534F, 5.0324F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.7288F, -0.0146F, -1.2464F, 5.4575F, 0.0291F, 2.4929F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.6711F, -0.0073F, -2.924F, 1.3422F, 0.0146F, 5.8479F, new CubeDeformation(0.0F)).texOffs(4, 11)
						.addBox(-2.9F, -2.0F, -3.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 21.0F, -1.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		sphere.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}