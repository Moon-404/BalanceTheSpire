package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Evaluate;

@SpirePatch(clz = Evaluate.class, method = SpirePatch.CONSTRUCTOR)
public class EvaluateBase {
    public static void Postfix(Evaluate __instance) {
        __instance.baseBlock += 2;
    }
}
