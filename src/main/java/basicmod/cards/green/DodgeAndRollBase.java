package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard.CardRarity;
import com.megacrit.cardcrawl.cards.green.DodgeAndRoll;

@SpirePatch(clz = DodgeAndRoll.class, method = SpirePatch.CONSTRUCTOR)
public class DodgeAndRollBase {
    public static void Postfix(DodgeAndRoll __instance) {
        __instance.rarity = CardRarity.UNCOMMON;
        __instance.baseMagicNumber = 150;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
