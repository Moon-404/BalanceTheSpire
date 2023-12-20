package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.BootSequence;

import basemod.ReflectionHacks;

@SpirePatch(clz = BootSequence.class, method = "upgrade")
public class BootSequenceUpgrade {
    public static void Replace(BootSequence __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeMagicNumber", int.class).invoke(__instance, 1);
        }
    }
}
