package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.WindmillStrike;

@SpirePatch(clz = WindmillStrike.class, method = "upgrade")
public class WindmillStrikeUpgrade {
    public static void Prefix(WindmillStrike __instance) {
        if (!__instance.upgraded) {
            __instance.baseMagicNumber += 1;
            __instance.magicNumber = __instance.baseMagicNumber;
        }
    }
}
