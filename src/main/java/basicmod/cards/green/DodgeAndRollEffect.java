package basicmod.cards.green;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.green.DodgeAndRoll;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.AbstractPower;

@SpirePatch(clz = AbstractCard.class, method = "applyPowersToBlock")
public class DodgeAndRollEffect {
    private static int rawAmount;

    public static void Prefix(AbstractCard __instance) {
        if (__instance instanceof DodgeAndRoll) {
            AbstractPower dexterity = AbstractDungeon.player.getPower("Dexterity");
            if (dexterity != null) {
                rawAmount = dexterity.amount;
                dexterity.amount = dexterity.amount * __instance.magicNumber / 100;
            }
        }
    }

    public static void Postfix(AbstractCard __instance) {
        if (__instance instanceof DodgeAndRoll) {
            AbstractPower dexterity = AbstractDungeon.player.getPower("Dexterity");
            if (dexterity != null) {
                dexterity.amount = rawAmount;
            }
        }
    }
}
