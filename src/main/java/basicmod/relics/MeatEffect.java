package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.MeatOnTheBone;

@SpirePatch(clz = MeatOnTheBone.class, method = "onTrigger")
public class MeatEffect {
    public static void Replace(MeatOnTheBone __instance) {
        AbstractPlayer p = AbstractDungeon.player;
        if ((float)p.currentHealth <= (float)p.maxHealth / 2.0F && p.currentHealth > 0) {
            __instance.flash();
            AbstractDungeon.actionManager.addToBottom(new RelicAboveCreatureAction(AbstractDungeon.player, __instance));
            p.heal(10);
            __instance.stopPulse();
        }
    }
}
