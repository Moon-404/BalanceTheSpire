package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.WildStrike;

@SpirePatch(clz = WildStrike.class, method = "upgrade")
public class WildStrikeUpgrade {
    public static void Prefix(WildStrike __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage -= 1;
        }
    }
}
