package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Conclude;

@SpirePatch(clz = Conclude.class, method = SpirePatch.CONSTRUCTOR)
public class ConcludeBase {
    public static void Postfix(Conclude __instance) {
        __instance.baseDamage -= 1;
    }
}
