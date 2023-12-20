package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.tempCards.Expunger;

@SpirePatch(clz = Expunger.class, method = SpirePatch.CONSTRUCTOR)
public class ExpungerBase {
    public static void Postfix(Expunger __instance) {
        __instance.baseDamage += 2;
    }
}
