package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.RingOfTheSerpent;

@SpirePatch(clz = RingOfTheSerpent.class, method = "getUpdatedDescription")
public class RingOfTheSerpentDescription {
    public static String Replace(RingOfTheSerpent __instance) {
        return "替换 #g蛇之戒指 。第一回合开始时，额外抽 #b2 张牌；其余回合开始时，额外抽 #b1 张牌";
    }
}
