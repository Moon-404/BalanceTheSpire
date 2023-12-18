package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.AbstractGameAction.AttackEffect;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.cards.red.ThunderClap;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.powers.VulnerablePower;
import java.util.Iterator;

@SpirePatch(clz = ThunderClap.class, method = "use")
public class ThunderClapUse {
    public static void Postfix(ThunderClap __instance, AbstractPlayer p, AbstractMonster m) {
        if (__instance.upgraded) {
            Iterator<AbstractMonster> var3 = AbstractDungeon.getCurrRoom().monsters.monsters.iterator();
            while (var3.hasNext()) {
                AbstractMonster mo = var3.next();
                AbstractDungeon.actionManager.addToBottom(new ApplyPowerAction(mo, p, new VulnerablePower(mo, 1, false), 1, true, AttackEffect.NONE));
            }
        }
    }
}
