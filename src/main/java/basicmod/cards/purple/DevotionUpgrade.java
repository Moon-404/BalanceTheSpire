package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.purple.Devotion;

import basemod.ReflectionHacks;

@SpirePatch(clz = Devotion.class, method = "upgrade")
public class DevotionUpgrade {
    public static void Replace(Devotion __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            __instance.isInnate = true;
            __instance.rawDescription = " 固有 。 NL " + __instance.rawDescription;
            __instance.initializeDescription();
        }
    }
}
