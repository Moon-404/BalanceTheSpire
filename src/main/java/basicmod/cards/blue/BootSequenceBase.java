package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.BootSequence;

@SpirePatch(clz = BootSequence.class, method = SpirePatch.CONSTRUCTOR)
public class BootSequenceBase {
    public static void Postfix(BootSequence __instance) {
        __instance.baseBlock = 0;
        __instance.baseMagicNumber = 1;
        __instance.magicNumber = 1;
    }
}
