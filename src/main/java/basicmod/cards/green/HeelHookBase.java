package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.HeelHook;

@SpirePatch(clz = HeelHook.class, method = SpirePatch.CONSTRUCTOR)
public class HeelHookBase {
    public static void Postfix(HeelHook __instance) {
        __instance.baseDamage += 2;
    }
}
