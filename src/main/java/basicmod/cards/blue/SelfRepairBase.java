package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.SelfRepair;

@SpirePatch(clz = SelfRepair.class, method = SpirePatch.CONSTRUCTOR)
public class SelfRepairBase {
    public static void Postfix(SelfRepair __instance) {
        __instance.baseMagicNumber -= 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
