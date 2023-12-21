package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Stack;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

@SpirePatch(clz = AbstractCard.class, method = "applyPowers")
public class StackEffect {
    public static void Prefix(AbstractCard __instance) {
        if (__instance instanceof Stack) {
            __instance.baseBlock = AbstractDungeon.player.discardPile.size();
        }
    }
}
