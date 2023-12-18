package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Berserk;

@SpirePatch(clz = Berserk.class, method = SpirePatch.CONSTRUCTOR)
public class BerserkBase {
    @SpirePostfixPatch
    public static void postfix(Berserk instance) {
        instance.selfRetain = true;
    }
}
