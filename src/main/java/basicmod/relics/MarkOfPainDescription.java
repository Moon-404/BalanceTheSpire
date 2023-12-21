package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.MarkOfPain;

@SpirePatch(clz = MarkOfPain.class, method = "getUpdatedDescription")
public class MarkOfPainDescription {
    public static String Replace(MarkOfPain __instance) {
        return "每回合开始获得 [R] 。在战斗开始时，在你的抽牌堆和弃牌堆各放入 #b1 张 #r伤口 。";
    }
}
