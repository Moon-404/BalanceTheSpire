package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.StoneCalendar;

@SpirePatch(clz = StoneCalendar.class, method = SpirePatch.CONSTRUCTOR)
public class StoneCalendarBase {
    public static void Postfix(StoneCalendar __instance) {
        __instance.counter = 0;
    }
}
