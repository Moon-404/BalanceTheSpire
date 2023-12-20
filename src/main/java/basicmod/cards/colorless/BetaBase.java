package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.tempCards.Beta;

@SpirePatch(clz = Beta.class, method = SpirePatch.CONSTRUCTOR)
public class BetaBase {
    public static void Postfix(Beta __instance) {
        __instance.cost = 1;
        __instance.costForTurn = 1;
    }
}
