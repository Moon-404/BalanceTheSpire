package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.powers.watcher.LikeWaterPower;

@SpirePatch(clz = LikeWaterPower.class, method = "atEndOfTurnPreEndTurnCards")
public class LikeWaterDisable {
    public static void Replace(LikeWaterPower __instance, boolean isPlayer) {
    }
}
