package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.StoneCalendar;

@SpirePatch(clz = StoneCalendar.class, method = "getUpdatedDescription")
public class StoneCalendarDescription {
    public static String Replace(StoneCalendar __instance) {
        return "每 #b12 回合结束时，对所有敌人造成 #b30 点伤害。（跨战斗保留）";
    }
}
