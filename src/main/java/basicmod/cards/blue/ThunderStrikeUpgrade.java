package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.ThunderStrike;

@SpirePatch(clz = ThunderStrike.class, method = "upgrade")
public class ThunderStrikeUpgrade {
    public static void Prefix(ThunderStrike __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage += 1;
        }
    }
}
