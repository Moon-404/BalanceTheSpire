package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Clothesline;

@SpirePatch(clz = Clothesline.class, method = SpirePatch.CONSTRUCTOR)
public class ClotheslineBase {
    @SpirePostfixPatch
    public static void postfix(Clothesline instance) {
        instance.baseDamage += 1;
    }
}
