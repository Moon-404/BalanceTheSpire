package basicmod.cards.colorless;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.utility.ScryAction;
import com.megacrit.cardcrawl.cards.tempCards.Beta;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

@SpirePatch(clz = Beta.class, method = "use")
public class BetaUpgrade {
    public static void Postfix(Beta __instance, AbstractPlayer p, AbstractMonster m) {
        if (__instance.upgraded) {
            AbstractDungeon.actionManager.addToBottom(new ScryAction(2));
        }
    }
}
