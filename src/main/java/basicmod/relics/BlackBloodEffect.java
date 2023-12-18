package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.BlackBlood;

@SpirePatch(clz = BlackBlood.class, method = "onVictory")
public class BlackBloodEffect {
    public static void Replace(BlackBlood __instance) {
        __instance.flash();
        AbstractPlayer p = AbstractDungeon.player;
        AbstractDungeon.actionManager.addToBottom(new RelicAboveCreatureAction(p, __instance));
        if (p.currentHealth > 0) {
            p.heal(15);
        }
    }
}
