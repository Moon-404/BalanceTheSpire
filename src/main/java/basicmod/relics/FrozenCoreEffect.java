package basicmod.relics;

import java.lang.reflect.Field;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.orbs.AbstractOrb;
import com.megacrit.cardcrawl.orbs.Frost;

@SpirePatch(clz = AbstractOrb.class, method = "applyFocus")
public class FrozenCoreEffect {
    public static void Prefix(AbstractOrb __instance) {
        if (__instance instanceof Frost && AbstractDungeon.player.hasRelic("FrozenCore")) {
            addBasePassiveAmount(__instance, 2);
            addBaseEvokeAmount(__instance, 2);
        }
    }

    public static void Postfix(AbstractOrb __instance) {
        if (__instance instanceof Frost && AbstractDungeon.player.hasRelic("FrozenCore")) {
            addBasePassiveAmount(__instance, -2);
            addBaseEvokeAmount(__instance, -2);
        }
    }

    public static void addBasePassiveAmount(AbstractOrb orb, int delta) {
        try {
            Field field = AbstractOrb.class.getDeclaredField("basePassiveAmount");
            field.setAccessible(true);
            int raw = field.getInt(orb);
            field.set(orb, raw + delta);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void addBaseEvokeAmount(AbstractOrb orb, int delta) {
        try {
            Field field = AbstractOrb.class.getDeclaredField("baseEvokeAmount");
            field.setAccessible(true);
            int raw = field.getInt(orb);
            field.set(orb, raw + delta);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
