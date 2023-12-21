package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Feed;

@SpirePatch(clz = Feed.class, method = "upgrade")
public class FeedUpgrade {
    public static void Prefix(Feed __instance) {
        if (!__instance.upgraded) {
            __instance.baseDamage += 1;
        }
    }
}
