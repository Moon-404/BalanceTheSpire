package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.AbstractGameAction.AttackEffect;
import com.megacrit.cardcrawl.actions.animations.VFXAction;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.actions.common.DamageAllEnemiesAction;
import com.megacrit.cardcrawl.actions.utility.SFXAction;
import com.megacrit.cardcrawl.cards.red.ThunderClap;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.powers.VulnerablePower;
import com.megacrit.cardcrawl.vfx.combat.LightningEffect;

import java.util.Iterator;

@SpirePatch(clz = ThunderClap.class, method = "use")
public class ThunderClapUse {
    public static void Replace(ThunderClap __instance, AbstractPlayer p, AbstractMonster m) {
        AbstractDungeon.actionManager.addToBottom(new SFXAction("THUNDERCLAP", 0.05F));
        Iterator<AbstractMonster> var3 = AbstractDungeon.getCurrRoom().monsters.monsters.iterator();
        AbstractMonster mo;

        while (var3.hasNext()) {
            mo = var3.next();
            if (!mo.isDeadOrEscaped()) {
                AbstractDungeon.actionManager.addToBottom(new VFXAction(new LightningEffect(mo.drawX, mo.drawY), 0.05F));
            }
        }
        AbstractDungeon.actionManager.addToBottom(new DamageAllEnemiesAction(p, __instance.multiDamage, __instance.damageTypeForTurn, AttackEffect.NONE));

        int lv = __instance.upgraded ? 2 : 1;
        var3 = AbstractDungeon.getCurrRoom().monsters.monsters.iterator();
        while (var3.hasNext()) {
            mo = var3.next();
            AbstractDungeon.actionManager.addToBottom(new ApplyPowerAction(mo, p, new VulnerablePower(mo, lv, false), lv, true, AttackEffect.NONE));
        }
    }
}
