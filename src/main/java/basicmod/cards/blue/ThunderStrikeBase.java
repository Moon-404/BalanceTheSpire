package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.ThunderStrike;

@SpirePatch(clz = ThunderStrike.class, method = SpirePatch.CONSTRUCTOR)
public class ThunderStrikeBase {
    public static void Postfix(ThunderStrike __instance) {
        __instance.baseDamage += 2;
    }
}
