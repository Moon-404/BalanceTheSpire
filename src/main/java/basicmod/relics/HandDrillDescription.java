package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.HandDrill;

@SpirePatch(clz = HandDrill.class, method = "getUpdatedDescription")
public class HandDrillDescription {
    public static String Replace(HandDrill __instance) {
        return "每当你突破敌人的 #y格挡 时，给予其 #b2 层 #y易伤 和 #y虚弱 。";
    }
}
