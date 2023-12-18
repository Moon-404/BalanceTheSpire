package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.HeavyBlade;

@SpirePatch(clz = HeavyBlade.class, method = "upgrade")
public class HeavyBladeUpgrade {
    @SpirePrefixPatch
    public static void prefix(HeavyBlade instance) {
        if (!instance.upgraded) {
            instance.upgradedDamage = true;
            instance.baseDamage += 2;
        }
    }
}
