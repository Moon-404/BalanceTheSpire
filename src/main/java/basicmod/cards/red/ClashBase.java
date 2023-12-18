package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Clash;

@SpirePatch(clz = Clash.class, method = SpirePatch.CONSTRUCTOR)
public class ClashBase {
    @SpirePostfixPatch
    public static void postfix(Clash instance) {
        instance.baseDamage += 2;
    }
}
