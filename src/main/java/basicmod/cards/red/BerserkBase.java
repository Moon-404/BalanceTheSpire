package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Berserk;

@SpirePatch(clz = Berserk.class, method = SpirePatch.CONSTRUCTOR)
public class BerserkBase {
    public static void Postfix(Berserk __instance) {
        __instance.selfRetain = true;
    }
}
