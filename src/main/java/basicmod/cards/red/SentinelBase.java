package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Sentinel;

@SpirePatch(clz = Sentinel.class, method = SpirePatch.CONSTRUCTOR)
public class SentinelBase {
    public static void Postfix(Sentinel __instance) {
        __instance.baseBlock += 2;
    }
}
