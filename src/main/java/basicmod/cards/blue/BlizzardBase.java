package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Blizzard;

@SpirePatch(clz = Blizzard.class, method = SpirePatch.CONSTRUCTOR)
public class BlizzardBase {
    public static void Postfix(Blizzard __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber += 1;
    }
}
