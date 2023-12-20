package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard.CardRarity;
import com.megacrit.cardcrawl.cards.purple.Sanctity;

@SpirePatch(clz = Sanctity.class, method = SpirePatch.CONSTRUCTOR)
public class SanctityBase {
    public static void Postfix(Sanctity __instance) {
        __instance.rarity = CardRarity.COMMON;
    }
}
