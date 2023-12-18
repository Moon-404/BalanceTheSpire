package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.SeeingRed;
import com.megacrit.cardcrawl.cards.status.Burn;

@SpirePatch(clz = SeeingRed.class, method = SpirePatch.CONSTRUCTOR)
public class SeeingRedBase {
    public static void Postfix(SeeingRed __instance) {
        __instance.cardsToPreview = new Burn();
    }
}
