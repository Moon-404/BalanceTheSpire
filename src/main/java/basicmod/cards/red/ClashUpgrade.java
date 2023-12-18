package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.Clash;

@SpirePatch(clz = Clash.class, method = "upgrade")
public class ClashUpgrade {
    @SpirePrefixPatch
    public static void prefix(Clash instance) {
        if (!instance.upgraded) {
            instance.baseDamage += 1;
        }
    }
}
