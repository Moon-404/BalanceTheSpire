package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.green.Outmaneuver;
import basemod.ReflectionHacks;

@SpirePatch(clz = Outmaneuver.class, method = "upgrade")
public class OutmaneuverUpgrade {
    public static void Prefix(Outmaneuver __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeBaseCost", int.class).invoke(__instance, 0);
        }
    }
}
