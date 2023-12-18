package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.SecondWind;

@SpirePatch(clz = SecondWind.class, method = SpirePatch.CONSTRUCTOR)
public class SecondWindBase {
    @SpirePostfixPatch
    public static void postfix(SecondWind instance) {
        instance.baseBlock -= 1;
    }
}
