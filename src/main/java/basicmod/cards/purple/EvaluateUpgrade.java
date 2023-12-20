package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Evaluate;

@SpirePatch(clz = Evaluate.class, method = "upgrade")
public class EvaluateUpgrade {
    public static void Prefix(Evaluate __instance) {
        if (!__instance.upgraded) {
            __instance.baseBlock -= 1;
        }
    }
}
