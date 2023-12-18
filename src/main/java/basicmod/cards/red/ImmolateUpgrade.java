package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.Immolate;

@SpirePatch(clz = Immolate.class, method = "upgrade")
public class ImmolateUpgrade {
    @SpirePrefixPatch
    public static void prefix(Immolate instance) {
        if (!instance.upgraded) {
            instance.baseDamage -= 1;
        }
    }
}
