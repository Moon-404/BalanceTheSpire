package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.JustLucky;

@SpirePatch(clz = JustLucky.class, method = SpirePatch.CONSTRUCTOR)
public class JustLuckyBase {
    public static void Postfix(JustLucky __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
        __instance.baseDamage -= 1;
    }
}
