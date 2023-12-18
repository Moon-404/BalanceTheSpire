package basicmod.events;

import java.util.ArrayList;
import java.util.List;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.AbstractCard.CardTags;
import com.megacrit.cardcrawl.cards.colorless.Bite;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.events.city.Vampires;
import com.megacrit.cardcrawl.vfx.cardManip.ShowCardAndObtainEffect;

@SpirePatch(clz = Vampires.class, method = "replaceAttacks")
public class VampiresReplace {
    public static void Replace(Vampires __instance, List<String> ___bites) {
        ArrayList<AbstractCard> masterDeck = AbstractDungeon.player.masterDeck.group;
        int count = 0;
        for (int i = 0; i < masterDeck.size(); i++) {
            AbstractCard card = (AbstractCard)masterDeck.get(i);
            if (card.tags.contains(CardTags.STARTER_STRIKE)) {
                AbstractDungeon.player.masterDeck.removeCard(card);
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            AbstractCard c = new Bite();
            AbstractDungeon.effectList.add(new ShowCardAndObtainEffect(c, (float)Settings.WIDTH / 2.0F, (float)Settings.HEIGHT / 2.0F));
            ___bites.add(c.cardID);
        }
    }
}
