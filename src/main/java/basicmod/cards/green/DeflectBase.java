package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.Deflect;

@SpirePatch(clz = Deflect.class, method = SpirePatch.CONSTRUCTOR)
public class DeflectBase {
    public static void Postfix(Deflect __instance) {
        __instance.baseBlock += 1;
    }
}
