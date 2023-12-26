package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.DrawCardAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.powers.watcher.LikeWaterPower;

@SpirePatch(clz = AbstractPower.class, method = "atStartOfTurn")
public class LikeWaterEffect {
    public static void Prefix(AbstractPower __instance) {
        if (__instance instanceof LikeWaterPower) {
            AbstractPlayer p = (AbstractPlayer)__instance.owner;
            if (p.stance.ID.equals("Calm")) {
                __instance.flash();
                AbstractDungeon.actionManager.addToBottom(new DrawCardAction(__instance.amount));
            }
        }
    }
}
