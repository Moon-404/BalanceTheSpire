package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.AbstractGameAction.AttackEffect;
import com.megacrit.cardcrawl.actions.common.DamageAllEnemiesAction;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.cards.DamageInfo.DamageType;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.JuggernautPower;

@SpirePatch(clz = JuggernautPower.class, method = "onGainedBlock")
public class JuggernautTrigger {
    public static void Replace(JuggernautPower __instance, float blockAmount) {
        if (blockAmount > 0.0F) {
            __instance.flash();
            AbstractDungeon.actionManager.addToBottom(new DamageAllEnemiesAction(__instance.owner, DamageInfo.createDamageMatrix(__instance.amount, true), DamageType.THORNS, AttackEffect.SLASH_HORIZONTAL));
        }
    }
}
