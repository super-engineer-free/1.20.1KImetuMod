package com.tenthousand.KimetuMod.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.lwjgl.glfw.GLFW;

public class onRegisterClient {

  public static KeyMapping KEY_FOG_BREATH = new KeyMapping("key.breath.fog", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_Z, "key.categories.kimetumod");

  @SubscribeEvent
  public static void onRegisterClient(RegisterKeyMappingsEvent event) {
    // 既存のキーバインドに加えて追加
    event.register(KEY_FOG_BREATH);
  }


}
