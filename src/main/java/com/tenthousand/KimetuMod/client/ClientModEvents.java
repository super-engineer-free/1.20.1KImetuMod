package com.tenthousand.KimetuMod.client;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PacketDistributor;
import com.mojang.blaze3d.platform.InputConstants;
import com.tenthousand.KimetuMod.network.packet.FogBreathC2SPacket;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.lwjgl.glfw.GLFW;

public class ClientModEvents {

  public static KeyMapping KEY_FOG_BREATH;

  @SubscribeEvent
  public static void onRegisterClient(RegisterKeyMappingsEvent event) {
    // ここでは初期化（代入）を行う
    KEY_FOG_BREATH = new KeyMapping("key.breath.fog", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Z, "key.categories.kimetsu");
    event.register(KEY_FOG_BREATH);
  }


  // onClientTickメソッドもこのクラス内に移動させる
}