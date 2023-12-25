package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.MentalFortress;

@SpirePatch(clz = MentalFortress.class, method = SpirePatch.CONSTRUCTOR)
public class MentalFortressBase {
    public static void Postfix(MentalFortress __instance) {
        __instance.baseMagicNumber -= 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
