package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Immolate;

@SpirePatch(clz = Immolate.class, method = "upgrade")
public class ImmolateUpgrade {
    public static void Prefix(Immolate __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage -= 1;
        }
    }
}
