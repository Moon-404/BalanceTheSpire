package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.SearingBlow;

@SpirePatch(clz = SearingBlow.class, method = SpirePatch.CONSTRUCTOR, paramtypez = {int.class})
public class SearingBlowBase {
    @SpirePostfixPatch
    public static void postfix(SearingBlow instance) {
        instance.baseDamage += 2;
    }
}
