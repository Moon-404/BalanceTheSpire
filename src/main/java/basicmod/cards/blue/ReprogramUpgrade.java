package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Reprogram;

import basemod.ReflectionHacks;

@SpirePatch(clz = Reprogram.class, method = "upgrade")
public class ReprogramUpgrade {
    public static void Replace(Reprogram __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeBaseCost", int.class).invoke(__instance, 0);
        }
    }
}
