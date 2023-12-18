package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.red.Clothesline;

@SpirePatch(clz = Clothesline.class, method = "upgrade")
public class ClotheslineUpgrade {
    @SpirePrefixPatch
    public static void prefix(Clothesline instance) {
        if (!instance.upgraded) {
            instance.baseDamage += 1;
        }
    }
}
