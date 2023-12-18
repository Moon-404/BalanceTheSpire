package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.SecondWind;

@SpirePatch(clz = SecondWind.class, method = SpirePatch.CONSTRUCTOR)
public class SecondWindBase {
    public static void Postfix(SecondWind __instance) {
        __instance.baseBlock -= 1;
    }
}
