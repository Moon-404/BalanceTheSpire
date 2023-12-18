package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Sentinel;

@SpirePatch(clz = Sentinel.class, method = SpirePatch.CONSTRUCTOR)
public class SentinelBase {
    @SpirePostfixPatch
    public static void postfix(Sentinel instance) {
        instance.baseBlock += 2;
    }
}
