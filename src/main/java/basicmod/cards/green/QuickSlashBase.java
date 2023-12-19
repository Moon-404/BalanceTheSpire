package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.QuickSlash;

@SpirePatch(clz = QuickSlash.class, method = SpirePatch.CONSTRUCTOR)
public class QuickSlashBase {
    public static void Postfix(QuickSlash __instance) {
        __instance.baseDamage += 1;
    }
}
