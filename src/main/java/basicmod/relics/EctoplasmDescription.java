package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Ectoplasm;

@SpirePatch(clz = Ectoplasm.class, method = "getUpdatedDescription")
public class EctoplasmDescription {
    public static String Replace(Ectoplasm __instance) {
        return "在回合开始时获得 [E] 。你的 #y金币 上限为 #b150 。";
    }
}
