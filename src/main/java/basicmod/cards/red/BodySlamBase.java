package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard.CardRarity;
import com.megacrit.cardcrawl.cards.red.BodySlam;

@SpirePatch(clz = BodySlam.class, method = SpirePatch.CONSTRUCTOR)
public class BodySlamBase {
    public static void Postfix(BodySlam __instance) {
        __instance.rarity = CardRarity.UNCOMMON;
    }
}
