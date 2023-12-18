package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Juggernaut;

@SpirePatch(clz = Juggernaut.class, method = "upgrade")
public class JuggernautUpgrade {
    public static void Prefix(Juggernaut __instance) {
        if (!__instance.upgraded) {
            __instance.baseMagicNumber -= 1;
        }
    }
}
