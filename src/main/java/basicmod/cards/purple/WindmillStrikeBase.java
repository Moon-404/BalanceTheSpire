package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.WindmillStrike;

@SpirePatch(clz = WindmillStrike.class, method = SpirePatch.CONSTRUCTOR)
public class WindmillStrikeBase {
    public static void Postfix(WindmillStrike __instance) {
        __instance.baseMagicNumber += 1;
        __instance.magicNumber = __instance.baseMagicNumber;
    }
}
