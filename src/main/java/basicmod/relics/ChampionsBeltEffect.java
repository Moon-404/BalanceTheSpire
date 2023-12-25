package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.WeakPower;
import com.megacrit.cardcrawl.relics.ChampionsBelt;

@SpirePatch(clz = ChampionsBelt.class, method = "onTrigger")
public class ChampionsBeltEffect {
    public static void Replace(ChampionsBelt __instance, AbstractCreature target) {
        AbstractDungeon.actionManager.addToBottom(new RelicAboveCreatureAction(AbstractDungeon.player, __instance));
        AbstractDungeon.actionManager.addToBottom(new ApplyPowerAction(target, AbstractDungeon.player, new WeakPower(target, 2, false), 2));
    }
}
