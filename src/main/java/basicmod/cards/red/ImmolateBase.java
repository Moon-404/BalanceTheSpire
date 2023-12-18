package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Immolate;

@SpirePatch(clz = Immolate.class, method = SpirePatch.CONSTRUCTOR)
public class ImmolateBase {
    public static void Postfix(Immolate __instance) {
        __instance.baseDamage -= 1;
    }
}
