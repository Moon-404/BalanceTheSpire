package basicmod.cards.purple;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.purple.Vault;

import basemod.ReflectionHacks;

@SpirePatch(clz = Vault.class, method = "upgrade")
public class VaultUpgrade {
    public static void Replace(Vault __instance) {
        if (!__instance.upgraded) {
            ReflectionHacks.privateMethod(AbstractCard.class, "upgradeName").invoke(__instance);
            __instance.selfRetain = true;
            __instance.rawDescription = " 保留 。 NL " + __instance.rawDescription;
            __instance.initializeDescription();
        }
    }
}
