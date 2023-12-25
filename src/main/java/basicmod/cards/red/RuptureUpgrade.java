package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.red.Rupture;

import basemod.ReflectionHacks;

@SpirePatch(clz = Rupture.class, method = "upgrade")
public class RuptureUpgrade {
    public static void Replace(Rupture __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            __instance.isInnate = true;
            __instance.rawDescription = " 固有 。 NL " + __instance.rawDescription;
            __instance.initializeDescription();
        }
    }
}
