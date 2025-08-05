package com.tenthousand.KimetuMod.network.packet;

import com.tenthousand.KimetuMod.abilities.BreathAbilities;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkEvent.Context;


public class FogBreathC2SPacket {
  public void handle(Supplier<Context> ctx) {
    ctx.get().enqueueWork(() -> {
      ServerPlayer player = ctx.get().getSender();
      // 霞の呼吸 壱ノ型の効果を適用
      // ここを修正: BreathAbilities.applyFogBreath(player);
      BreathAbilities.applyFogBreath(player);
    });
    ctx.get().setPacketHandled(true);
  }
}