package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Claw;

import basemod.ReflectionHacks;

@SpirePatch(clz = Claw.class, method = "upgrade")
public class ClawUpgrade {
    public static void Replace(Claw __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeMagicNumber", int.class).invoke(__instance, 1);
        }
    }
}
