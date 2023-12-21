package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.SeverSoul;

@SpirePatch(clz = SeverSoul.class, method = SpirePatch.CONSTRUCTOR)
public class SeverSoulBase {
    public static void Postfix(SeverSoul __instance) {
        __instance.baseDamage += 2;
    }
}
