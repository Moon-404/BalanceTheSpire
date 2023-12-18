package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.ThunderClap;

@SpirePatch(clz = ThunderClap.class, method = SpirePatch.CONSTRUCTOR)
public class ThunderClapBase {
    @SpirePostfixPatch
    public static void postfix(ThunderClap instance) {
        instance.baseMagicNumber = 1;
        instance.magicNumber = instance.baseMagicNumber;
        instance.baseDamage += 1;
    }
}
