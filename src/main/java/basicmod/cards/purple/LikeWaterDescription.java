package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.powers.watcher.LikeWaterPower;

@SpirePatch(clz = LikeWaterPower.class, method = "updateDescription")
public class LikeWaterDescription {
    public static void Replace(LikeWaterPower __instance) {
        __instance.description = "在你的回合开始时，如果你处于 #y平静 ，抽 #b" + __instance.amount + " 张牌";
    }
}
