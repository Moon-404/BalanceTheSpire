package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.tempCards.Omega;

@SpirePatch(clz = Omega.class, method = SpirePatch.CONSTRUCTOR)
public class OmegaBase {
    public static void Postfix(Omega __instance) {
        __instance.cost = 1;
        __instance.costForTurn = 1;
    }
}
