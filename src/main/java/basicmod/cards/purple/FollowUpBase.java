package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.purple.FollowUp;

@SpirePatch(clz = FollowUp.class, method = SpirePatch.CONSTRUCTOR)
public class FollowUpBase {
    public static void Postfix(FollowUp __instance) {
        __instance.baseDamage += 1;
    }
}
