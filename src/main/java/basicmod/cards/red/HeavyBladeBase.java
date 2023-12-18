package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.HeavyBlade;

@SpirePatch(clz = HeavyBlade.class, method = SpirePatch.CONSTRUCTOR)
public class HeavyBladeBase {
    @SpirePostfixPatch
    public static void postfix(HeavyBlade instance) {
        instance.baseMagicNumber += 1;
        instance.magicNumber += 1;
    }
}
