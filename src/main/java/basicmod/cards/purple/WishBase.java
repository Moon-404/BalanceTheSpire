package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.Wish;

@SpirePatch(clz = Wish.class, method = SpirePatch.CONSTRUCTOR)
public class WishBase {
    public static void Postfix(Wish __instance) {
        __instance.baseDamage += 1;
        __instance.baseBlock += 1;
    }
}
