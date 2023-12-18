package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Clothesline;

@SpirePatch(clz = Clothesline.class, method = SpirePatch.CONSTRUCTOR)
public class ClotheslineBase {
    public static void Postfix(Clothesline __instance) {
        __instance.baseDamage += 1;
    }
}
