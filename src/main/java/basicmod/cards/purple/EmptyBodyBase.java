package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.EmptyBody;

@SpirePatch(clz = EmptyBody.class, method = SpirePatch.CONSTRUCTOR)
public class EmptyBodyBase {
    public static void Postfix(EmptyBody __instance) {
        __instance.baseBlock += 1;
    }
}
