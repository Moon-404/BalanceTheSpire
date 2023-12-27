package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.CripplingPoison;

@SpirePatch(clz = CripplingPoison.class, method = SpirePatch.CONSTRUCTOR)
public class CripplingPoisonBase {
    public static void Postfix(CripplingPoison __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber += 1;
    }
}
