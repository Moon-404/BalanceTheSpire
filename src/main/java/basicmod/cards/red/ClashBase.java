package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Clash;

@SpirePatch(clz = Clash.class, method = SpirePatch.CONSTRUCTOR)
public class ClashBase {
    public static void Postfix(Clash __instance) {
        __instance.baseDamage += 2;
    }
}
