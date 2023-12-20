package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Nirvana;

@SpirePatch(clz = Nirvana.class, method = SpirePatch.CONSTRUCTOR)
public class NirvanaBase {
    public static void Postfix(Nirvana __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
