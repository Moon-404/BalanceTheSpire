package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.Juggernaut;

@SpirePatch(clz = Juggernaut.class, method = "upgrade")
public class JuggernautUpgrade {
    @SpirePrefixPatch
    public static void prefix(Juggernaut instance) {
        if (!instance.upgraded) {
            instance.baseMagicNumber -= 1;
        }
    }
}
