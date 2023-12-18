package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Juggernaut;

@SpirePatch(clz = Juggernaut.class, method = SpirePatch.CONSTRUCTOR)
public class JuggernautBase {
    @SpirePostfixPatch
    public static void postfix(Juggernaut instance) {
        instance.cost = 1;
        instance.costForTurn = 1;
        instance.baseMagicNumber = 2;
        instance.magicNumber = instance.baseMagicNumber;
    }
}
