package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.actions.common.DrawCardAction;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

import basemod.BaseMod;
import basemod.interfaces.OnStartBattleSubscriber;

@SpireInitializer
public class RingOfTheSerpentEffect implements OnStartBattleSubscriber {
    public RingOfTheSerpentEffect() {
        BaseMod.subscribe(this);
    }

    public static void initialize() {
        new RingOfTheSerpentEffect();
    }

    @Override
    public void receiveOnBattleStart(AbstractRoom var1) {
        if (AbstractDungeon.player.hasRelic("Ring of the Serpent")) {
            AbstractDungeon.actionManager.addToBottom(new DrawCardAction(AbstractDungeon.player, 1));
        }
    }
}
