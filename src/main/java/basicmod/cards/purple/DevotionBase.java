package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Devotion;

@SpirePatch(clz = Devotion.class, method = SpirePatch.CONSTRUCTOR)
public class DevotionBase {
    public static void Postfix(Devotion __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
