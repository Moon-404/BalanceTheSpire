package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.tempCards.Beta;
import com.megacrit.cardcrawl.localization.CardStrings;

import basemod.ReflectionHacks;

@SpirePatch(clz = Beta.class, method = "upgrade")
public class BetaUpgrade {
    public static void Prefix(Beta __instance) {
        if (!__instance.upgraded) {
            __instance.rawDescription = ((CardStrings)ReflectionHacks.getPrivateStatic(Beta.class, "cardStrings")).UPGRADE_DESCRIPTION;
            __instance.initializeDescription();
        }
    }
}
