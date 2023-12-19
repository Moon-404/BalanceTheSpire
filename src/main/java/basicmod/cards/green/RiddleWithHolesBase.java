package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.green.RiddleWithHoles;

@SpirePatch(clz = RiddleWithHoles.class, method = SpirePatch.CONSTRUCTOR)
public class RiddleWithHolesBase {
    public static void Postfix(RiddleWithHoles __instance) {
        __instance.baseDamage -= 1;
    }
}
