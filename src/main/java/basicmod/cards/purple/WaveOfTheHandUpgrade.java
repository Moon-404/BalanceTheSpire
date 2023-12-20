package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.purple.WaveOfTheHand;

import basemod.ReflectionHacks;

@SpirePatch(clz = WaveOfTheHand.class, method = "upgrade")
public class WaveOfTheHandUpgrade {
    public static void Replace(WaveOfTheHand __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeBaseCost", int.class).invoke(__instance, 0);
        }
    }
}
