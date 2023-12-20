package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard.CardRarity;
import com.megacrit.cardcrawl.cards.green.DodgeAndRoll;

@SpirePatch(clz = DodgeAndRoll.class, method = SpirePatch.CONSTRUCTOR)
public class DodgeAndRollBase {
    public static void Postfix(DodgeAndRoll __instance) {
        __instance.rarity = CardRarity.UNCOMMON;
        __instance.baseBlock -= 1;
        __instance.baseMagicNumber = 2;
        __instance.magicNumber = 2;
    }
}
