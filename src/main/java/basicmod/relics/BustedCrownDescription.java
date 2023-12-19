package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.BustedCrown;

@SpirePatch(clz = BustedCrown.class, method = "getUpdatedDescription")
public class BustedCrownDescription {
    public static String Replace(BustedCrown __instance) {
        return "在每回合开始时获得 [E] 。在卡牌奖励画面， #b普通敌人 可供选择的牌数减少 #b2 张。";
    }
}
