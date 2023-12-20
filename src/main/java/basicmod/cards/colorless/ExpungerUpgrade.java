package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.tempCards.Expunger;

@SpirePatch(clz = Expunger.class, method = "upgrade")
public class ExpungerUpgrade {
    public static void Prefix(Expunger __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage -= 1;
        }
    }
}
