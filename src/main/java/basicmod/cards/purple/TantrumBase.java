package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Tantrum;

@SpirePatch(clz = Tantrum.class, method = SpirePatch.CONSTRUCTOR)
public class TantrumBase {
    public static void Postfix(Tantrum __instance) {
        __instance.baseDamage += 1;
        __instance.baseMagicNumber -= 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
