package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.WildStrike;

@SpirePatch(clz = WildStrike.class, method = "upgrade")
public class WildStrikeUpgrade {
    @SpirePrefixPatch
    public static void prefix(WildStrike instance) {
        if (!instance.upgraded) {
            instance.baseDamage -= 1;
        }
    }
}
