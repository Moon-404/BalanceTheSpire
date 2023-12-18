package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.HeavyBlade;

@SpirePatch(clz = HeavyBlade.class, method = SpirePatch.CONSTRUCTOR)
public class HeavyBladeBase {
    public static void Postfix(HeavyBlade __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber += 1;
    }
}
