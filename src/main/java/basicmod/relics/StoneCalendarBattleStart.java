package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.StoneCalendar;

@SpirePatch(clz = StoneCalendar.class, method = "atBattleStart")
public class StoneCalendarBattleStart {
    public static void Replace(StoneCalendar __instance) {
    }
}
