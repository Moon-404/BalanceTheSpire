package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.FrozenCore;

@SpirePatch(clz = FrozenCore.class, method = "onPlayerEndTurn")
public class FrozenCoreDisable {
    public static void Replace(FrozenCore __instance) {
    }
}
