package basicmod.relics;

import java.util.Iterator;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.relics.AbstractRelic;

@SpirePatch(clz = AbstractPlayer.class, method = "gainGold")
public class EctoplasmEffect {
    public static void Replace(AbstractPlayer __instance, int amount) {
        int last = 150 - __instance.gold;
        if (__instance.hasRelic("Ectoplasm") && amount > last) {
            amount = last;
            __instance.getRelic("Ectoplasm").flash();
        }
        if (amount > 0) {
            CardCrawlGame.goldGained += amount;
            __instance.gold += amount;
            Iterator<AbstractRelic> var2 = __instance.relics.iterator();
            while (var2.hasNext()) {
                AbstractRelic r = var2.next();
                r.onGainGold();
            }
        }
    }  
}
