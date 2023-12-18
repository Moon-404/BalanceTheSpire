package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Clothesline;

@SpirePatch(clz = Clothesline.class, method = "upgrade")
public class ClotheslineUpgrade {
    public static void Prefix(Clothesline __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage += 1;
        }
    }
}
