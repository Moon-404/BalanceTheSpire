package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import com.megacrit.cardcrawl.relics.BustedCrown;
import com.megacrit.cardcrawl.rooms.AbstractRoom;
import com.megacrit.cardcrawl.rooms.MonsterRoom;
import com.megacrit.cardcrawl.rooms.MonsterRoomBoss;
import com.megacrit.cardcrawl.rooms.MonsterRoomElite;

@SpirePatch(clz = AbstractRelic.class, method = "flash")
public class BustedCrownFlash {
    public static SpireReturn<Void> Prefix(AbstractRelic __instance) {
        if (__instance instanceof BustedCrown) {
            AbstractRoom room = AbstractDungeon.getCurrRoom();
            if (room instanceof MonsterRoom && !(room instanceof MonsterRoomElite) && !(room instanceof MonsterRoomBoss)) {
                return SpireReturn.Continue();
            } else {
                return SpireReturn.Return();
            }
        } else {
            return SpireReturn.Continue();
        }
    }
}
