package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.StoneCalendar;

@SpirePatch(clz = StoneCalendar.class, method = "atTurnStart")
public class StoneCalendarTurnStart {
    public static void Replace(StoneCalendar __instance) {
        __instance.counter++;
        if (__instance.counter > 12) {
            __instance.counter -= 12;
        }
        if (__instance.counter == 12) {
            __instance.beginLongPulse();
        }
    }
}
