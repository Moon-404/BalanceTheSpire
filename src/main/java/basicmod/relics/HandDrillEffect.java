package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.VulnerablePower;
import com.megacrit.cardcrawl.powers.WeakPower;
import com.megacrit.cardcrawl.relics.HandDrill;

@SpirePatch(clz = HandDrill.class, method = "onBlockBroken")
public class HandDrillEffect {
    public static void Replace(HandDrill __instance, AbstractCreature m) {
        __instance.flash();
        AbstractDungeon.actionManager.addToBottom(new RelicAboveCreatureAction(m, __instance));
        AbstractDungeon.actionManager.addToBottom(new ApplyPowerAction(m, AbstractDungeon.player, new VulnerablePower(m, 2, false), 2));
        AbstractDungeon.actionManager.addToBottom(new ApplyPowerAction(m, AbstractDungeon.player, new WeakPower(m, 2, false), 2));
    }
}
