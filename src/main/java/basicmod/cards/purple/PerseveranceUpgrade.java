package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Perseverance;

@SpirePatch(clz = Perseverance.class, method = "upgrade")
public class PerseveranceUpgrade {
    public static void Prefix(Perseverance __instance) {
        if (!__instance.upgraded) {
            __instance.baseBlock -= 1;
        }
    }
}
