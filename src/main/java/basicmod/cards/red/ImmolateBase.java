package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Immolate;

@SpirePatch(clz = Immolate.class, method = SpirePatch.CONSTRUCTOR)
public class ImmolateBase {
    @SpirePostfixPatch
    public static void postfix(Immolate instance) {
        instance.baseDamage -= 1;
    }
}
