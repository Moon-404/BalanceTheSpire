package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.PerfectedStrike;

@SpirePatch(clz = PerfectedStrike.class, method = SpirePatch.CONSTRUCTOR)
public class PerfectedStrikeBase {
    @SpirePostfixPatch
    public static void postfix(PerfectedStrike instance) {
        instance.baseDamage += 2;
    }
}
