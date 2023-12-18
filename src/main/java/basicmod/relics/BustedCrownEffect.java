package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.BustedCrown;
import com.megacrit.cardcrawl.rooms.AbstractRoom;
import com.megacrit.cardcrawl.rooms.MonsterRoom;
import com.megacrit.cardcrawl.rooms.MonsterRoomBoss;
import com.megacrit.cardcrawl.rooms.MonsterRoomElite;

@SpirePatch(clz = BustedCrown.class, method = "changeNumberOfCardsInReward")
public class BustedCrownEffect {
    public static int Replace(BustedCrown __instance, int numberOfCards) {
        AbstractRoom room = AbstractDungeon.getCurrRoom();
        if (room instanceof MonsterRoom && !(room instanceof MonsterRoomElite) && !(room instanceof MonsterRoomBoss)) {
            return numberOfCards - 2;
        } else {
            return numberOfCards;
        }
    }
}
