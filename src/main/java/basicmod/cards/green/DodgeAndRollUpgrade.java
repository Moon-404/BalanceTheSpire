package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.DodgeAndRoll;

@SpirePatch(clz = DodgeAndRoll.class, method = "upgrade")
public class DodgeAndRollUpgrade {
    public static void Prefix(DodgeAndRoll __instance) {
        if (!__instance.upgraded) {
            __instance.baseBlock -= 1;
            __instance.baseMagicNumber += 50;
            __instance.magicNumber = __instance.baseMagicNumber;
            __instance.upgradedMagicNumber = true;
        }
    }
}
