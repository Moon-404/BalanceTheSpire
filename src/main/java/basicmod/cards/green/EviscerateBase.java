package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.Eviscerate;

@SpirePatch(clz = Eviscerate.class, method = SpirePatch.CONSTRUCTOR)
public class EviscerateBase {
    public static void Postfix(Eviscerate __instance) {
        __instance.baseDamage -= 1;
    }
}
