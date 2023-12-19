package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.Envenom;

@SpirePatch(clz = Envenom.class, method = SpirePatch.CONSTRUCTOR)
public class EnvenomBase {
    public static void Postfix(Envenom __instance) {
        __instance.cost = 1;
        __instance.costForTurn = 1;
    }
}
