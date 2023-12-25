package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Reprogram;

@SpirePatch(clz = Reprogram.class, method = SpirePatch.CONSTRUCTOR)
public class ReprogramBase {
    public static void Postfix(Reprogram __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber += 1;
    }
}
