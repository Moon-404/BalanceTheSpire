package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.red.Feed;

@SpirePatch(clz = Feed.class, method = SpirePatch.CONSTRUCTOR)
public class FeedBase {
    public static void Postfix(Feed __instance) {
        __instance.baseDamage -= 3;
    }
}
