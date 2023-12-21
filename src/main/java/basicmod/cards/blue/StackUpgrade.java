package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Stack;
import com.megacrit.cardcrawl.localization.CardStrings;

import basemod.ReflectionHacks;

@SpirePatch(clz = Stack.class, method = "upgrade")
public class StackUpgrade {
    public static void Replace(Stack __instance) {
        if (!__instance.upgraded) {
            __instance.selfRetain = true;
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            __instance.rawDescription = ((CardStrings)ReflectionHacks.getPrivateStatic(Stack.class, "cardStrings")).UPGRADE_DESCRIPTION;
            __instance.initializeDescription();
        }
    }
}
