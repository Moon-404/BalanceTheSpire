package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Clash;

@SpirePatch(clz = Clash.class, method = "upgrade")
public class ClashUpgrade {
    public static void Prefix(Clash __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage += 1;
        }
    }
}
