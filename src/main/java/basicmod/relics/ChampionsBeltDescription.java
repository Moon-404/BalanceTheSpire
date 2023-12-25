package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.ChampionsBelt;

@SpirePatch(clz = ChampionsBelt.class, method = "getUpdatedDescription")
public class ChampionsBeltDescription {
    public static String Replace(ChampionsBelt __instance) {
        return __instance.DESCRIPTIONS[0] + 2 + __instance.DESCRIPTIONS[1];
    }
}
