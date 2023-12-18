package basicmod.cards.red;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.cards.red.Feed;

@SpirePatch(clz = Feed.class, method = SpirePatch.CONSTRUCTOR)
public class FeedBase {
    @SpirePostfixPatch
    public static void postfix(Feed instance) {
        instance.baseDamage -= 3;
    }
}
