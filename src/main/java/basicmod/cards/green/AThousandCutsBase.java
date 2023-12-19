package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.AThousandCuts;

@SpirePatch(clz = AThousandCuts.class, method = SpirePatch.CONSTRUCTOR)
public class AThousandCutsBase {
    public static void Postfix(AThousandCuts __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber += 1;
    }
}
