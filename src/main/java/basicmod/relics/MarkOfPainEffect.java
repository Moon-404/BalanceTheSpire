package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInDiscardAction;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.cards.status.Wound;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.MarkOfPain;

@SpirePatch(clz = MarkOfPain.class, method = "atBattleStart")
public class MarkOfPainEffect {
    public static void Replace(MarkOfPain __instance) {
        __instance.flash();
        AbstractDungeon.actionManager.addToBottom(new RelicAboveCreatureAction(AbstractDungeon.player, __instance));
        AbstractDungeon.actionManager.addToBottom(new MakeTempCardInDiscardAction(new Wound(), 2));
    }
}
