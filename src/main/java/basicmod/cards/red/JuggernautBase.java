package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard.CardRarity;
import com.megacrit.cardcrawl.cards.red.Juggernaut;

@SpirePatch(clz = Juggernaut.class, method = SpirePatch.CONSTRUCTOR)
public class JuggernautBase {
    public static void Postfix(Juggernaut __instance) {
        __instance.rarity = CardRarity.UNCOMMON;
        __instance.cost = 1;
        __instance.costForTurn = 1;
        __instance.baseMagicNumber = 2;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
