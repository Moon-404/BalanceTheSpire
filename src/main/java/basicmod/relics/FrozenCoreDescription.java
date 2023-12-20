package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.FrozenCore;

@SpirePatch(clz = FrozenCore.class, method = "getUpdatedDescription")
public class FrozenCoreDescription {
    public static String Replace(FrozenCore __instance) {
        return "替换 #r破损核心 。你的 #y冰霜 充能球获得 #b2 点额外 #y集中 。";
    }
}
