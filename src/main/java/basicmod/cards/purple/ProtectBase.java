package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Protect;

@SpirePatch(clz = Protect.class, method = SpirePatch.CONSTRUCTOR)
public class ProtectBase {
    public static void Postfix(Protect __instance) {
        __instance.baseBlock += 2;
    }
}
