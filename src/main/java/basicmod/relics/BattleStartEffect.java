package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.actions.GameActionManager;
import com.megacrit.cardcrawl.actions.common.DrawCardAction;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.actions.defect.IncreaseMaxOrbAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.orbs.Frost;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

import basemod.BaseMod;
import basemod.interfaces.OnStartBattleSubscriber;

@SpireInitializer
public class BattleStartEffect implements OnStartBattleSubscriber {
    public BattleStartEffect() {
        BaseMod.subscribe(this);
    }

    public static void initialize() {
        new BattleStartEffect();
    }

    @Override
    public void receiveOnBattleStart(AbstractRoom var1) {
        AbstractPlayer player = AbstractDungeon.player;
        GameActionManager actionManager = AbstractDungeon.actionManager;
        if (player.hasRelic("Ring of the Serpent")) {
            actionManager.addToBottom(new DrawCardAction(player, 1));
        }
        if (player.hasRelic("FrozenCore")) {
            player.channelOrb(new Frost());
        }
        if (player.hasRelic("Inserter")) {
            AbstractRelic inserter = player.getRelic("Inserter");
            inserter.flash();
            actionManager.addToBottom(new RelicAboveCreatureAction(player, inserter));
            actionManager.addToBottom(new IncreaseMaxOrbAction(1));
        }
    }
}
