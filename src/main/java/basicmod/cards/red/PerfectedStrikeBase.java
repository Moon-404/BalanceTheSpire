package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.PerfectedStrike;

@SpirePatch(clz = PerfectedStrike.class, method = SpirePatch.CONSTRUCTOR)
public class PerfectedStrikeBase {
    public static void Postfix(PerfectedStrike __instance) {
        __instance.baseDamage += 2;
    }
}
