package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Nirvana;

@SpirePatch(clz = Nirvana.class, method = "upgrade")
public class NirvanaUpgrade {
    public static void Prefix(Nirvana __instance) {
        if (!__instance.upgraded) {
            __instance.baseMagicNumber += 1;
            __instance.magicNumber = __instance.baseMagicNumber;
        }
    }
}
