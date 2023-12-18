package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.ThunderClap;

@SpirePatch(clz = ThunderClap.class, method = SpirePatch.CONSTRUCTOR)
public class ThunderClapBase {
    public static void Postfix(ThunderClap __instance) {
        __instance.baseMagicNumber = 1;
        __instance.magicNumber = __instance.baseMagicNumber;
        __instance.baseDamage += 1;
    }
}
