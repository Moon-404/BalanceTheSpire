package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.SeeingRed;
import com.megacrit.cardcrawl.cards.status.Burn;

@SpirePatch(clz = SeeingRed.class, method = SpirePatch.CONSTRUCTOR)
public class SeeingRedBase {
    @SpirePostfixPatch
    public static void postfix(SeeingRed instance) {
        instance.cardsToPreview = new Burn();
    }
}
