package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.CorpseExplosion;

@SpirePatch(clz = CorpseExplosion.class, method = SpirePatch.CONSTRUCTOR)
public class CorpseExplosionBase {
    public static void Postfix(CorpseExplosion __instance) {
        __instance.baseMagicNumber -= 1;
        __instance.magicNumber -= 1;
    }
}
