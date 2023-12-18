package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.StoneCalendar;

@SpirePatch(clz = StoneCalendar.class, method = "getUpdatedDescription")
public class StoneCalendarDescription {
    public static String Replace(StoneCalendar __instance) {
        return __instance.DESCRIPTIONS[0] + 12 + __instance.DESCRIPTIONS[1] + 30 + __instance.DESCRIPTIONS[2];
    }
}
