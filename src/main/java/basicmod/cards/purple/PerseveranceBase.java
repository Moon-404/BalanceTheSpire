package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Perseverance;

@SpirePatch(clz = Perseverance.class, method = SpirePatch.CONSTRUCTOR)
public class PerseveranceBase {
    public static void Postfix(Perseverance __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
