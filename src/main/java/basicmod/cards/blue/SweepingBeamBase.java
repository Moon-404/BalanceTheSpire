package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.SweepingBeam;

@SpirePatch(clz = SweepingBeam.class, method = SpirePatch.CONSTRUCTOR)
public class SweepingBeamBase {
    public static void Postfix(SweepingBeam __instance) {
        __instance.baseDamage += 1;
    }
}
