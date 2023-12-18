package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.ThunderClap;

@SpirePatch(clz = ThunderClap.class, method = "upgrade")
public class ThunderClapUpgrade {
    @SpirePrefixPatch
    public static void prefix(ThunderClap instance) {
        if (!instance.upgraded) {
            instance.baseDamage -= 2;
            instance.baseMagicNumber = 2;
            instance.magicNumber = instance.baseMagicNumber;
            instance.upgradedMagicNumber = true;
        }
    }
}
