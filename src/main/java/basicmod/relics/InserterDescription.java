package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.relics.Inserter;

@SpirePatch(clz = Inserter.class, method = "getUpdatedDescription")
public class InserterDescription {
    public static String Replace(Inserter __instance) {
        return "战斗开始时，获得 #b1 个充能球栏位。每 #b2 回合，获得 #b1 个充能球栏位。";
    }
}
