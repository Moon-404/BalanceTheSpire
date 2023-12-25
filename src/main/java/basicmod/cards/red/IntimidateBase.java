package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Intimidate;

@SpirePatch(clz = Intimidate.class, method = SpirePatch.CONSTRUCTOR)
public class IntimidateBase {
    public static void Postfix(Intimidate __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
