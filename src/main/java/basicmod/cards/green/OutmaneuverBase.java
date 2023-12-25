package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.Outmaneuver;

@SpirePatch(clz = Outmaneuver.class, method = SpirePatch.CONSTRUCTOR)
public class OutmaneuverBase {
    public static void Postfix(Outmaneuver __instance) {
        __instance.exhaust = true;
    }
}
