package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.AbstractGameAction.AttackEffect;
import com.megacrit.cardcrawl.actions.common.DamageAllEnemiesAction;
import com.megacrit.cardcrawl.cards.DamageInfo.DamageType;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.JuggernautPower;

@SpirePatch(clz = JuggernautPower.class, method = "onGainedBlock")
public class JuggernautTrigger {
    public static void Replace(JuggernautPower instance, float blockAmount) {
        if (blockAmount > 0.0F) {
            instance.flash();
            AbstractDungeon.actionManager.addToBottom(new DamageAllEnemiesAction((AbstractPlayer)instance.owner, instance.amount, DamageType.THORNS, AttackEffect.SLASH_HORIZONTAL));
        }
    }
}
