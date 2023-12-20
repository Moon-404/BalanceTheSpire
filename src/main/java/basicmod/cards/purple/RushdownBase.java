package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Rushdown;

@SpirePatch(clz = Rushdown.class, method = SpirePatch.CONSTRUCTOR)
public class RushdownBase {
    public static void Postfix(Rushdown __instance) {
        __instance.baseMagicNumber -= 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
