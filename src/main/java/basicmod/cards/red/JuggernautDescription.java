package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.powers.JuggernautPower;

@SpirePatch(clz = JuggernautPower.class, method = "updateDescription")
public class JuggernautDescription {
    public static void Replace(JuggernautPower __instance) {
        __instance.description = "每当你获得 #y格挡 时，对所有敌人造成 #b" + __instance.amount + " 点伤害。";
    }
}
