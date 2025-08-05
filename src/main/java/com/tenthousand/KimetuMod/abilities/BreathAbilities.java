package com.tenthousand.KimetuMod.abilities;

import net.minecraft.world.level.Level;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class BreathAbilities {


  public static void applyFogBreath(ServerPlayer player) {
    // プレイヤーを少し前に瞬間移動させる
    Vec3 look = player.getLookAngle();
    player.teleportTo(player.getX() + look.x * 2.0, player.getY(), player.getZ() + look.z * 2.0);

    // プレイヤー周囲のエンティティにダメージを与える
    AABB area = player.getBoundingBox().inflate(5.0); // 範囲を調整
    Level world = player.level(); // level()メソッドを使用

    world.getEntitiesOfClass(LivingEntity.class, area, LivingEntity -> LivingEntity != player)
        .forEach(LivingEntity -> {
          // DamageSourceの正しい取得方法
          DamageSource damageSource = world.damageSources().playerAttack(player);
          LivingEntity.hurt(damageSource, 20.0f);
        });

    // 霧を表現するパーティクルを生成
    for (int i = 0; i < 50; i++) {
      double dx = world.getRandom().nextDouble() * 10 - 5;
      double dy = world.getRandom().nextDouble() * 3;
      double dz = world.getRandom().nextDouble() * 10 - 5;
      world.addParticle(
          ParticleTypes.CLOUD,
          player.getX() + dx,
          player.getY() + dy,
          player.getZ() + dz,
          1, 0, 0
      );
    }

    // 音を再生
    world.playSound(null, player.getX(), player.getY(), player.getZ(),
        SoundEvents.PLAYER_ATTACK_SWEEP, SoundSource.PLAYERS, 1.5f, 1.0f);
  }
  }