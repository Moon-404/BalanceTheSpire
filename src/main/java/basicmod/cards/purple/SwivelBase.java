package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Swivel;

@SpirePatch(clz = Swivel.class, method = SpirePatch.CONSTRUCTOR)
public class SwivelBase {
    public static void Postfix(Swivel __instance) {
        __instance.baseBlock += 2;
    }
}
