package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.Caltrops;

@SpirePatch(clz = Caltrops.class, method = SpirePatch.CONSTRUCTOR)
public class CaltropsBase {
    public static void Postfix(Caltrops __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber += 1;
    }
}
