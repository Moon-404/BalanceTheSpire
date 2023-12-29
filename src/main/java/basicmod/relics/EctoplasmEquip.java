package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.relics.Ectoplasm;

@SpirePatch(clz = Ectoplasm.class, method = "onEquip")
public class EctoplasmEquip {
    public static void Postfix(Ectoplasm __instance) {
        AbstractPlayer player = AbstractDungeon.player;
        int amount = player.gold - 150;
        if (amount > 0) {
            player.loseGold(amount);
        }
    }
}
