package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.AbstractCard.CardRarity;
import com.megacrit.cardcrawl.cards.red.BodySlam;

@SpirePatch(clz = BodySlam.class, method = SpirePatch.CONSTRUCTOR)
public class BodySlamBase {
    @SpirePostfixPatch
    public static void postfix(BodySlam instance) {
        instance.rarity = CardRarity.UNCOMMON;
    }
}
