package basicmod.relics;

import com.evacipated.cardcrawl.modthespire.lib.LineFinder;
import com.evacipated.cardcrawl.modthespire.lib.Matcher;
import com.evacipated.cardcrawl.modthespire.lib.SpireInsertLocator;
import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.helpers.EventHelper;
import com.megacrit.cardcrawl.relics.AbstractRelic;

import javassist.CtBehavior;

@SpirePatch(clz = EventHelper.class, method = "roll")
public class TinyChestEffect {
    private static class Locator extends SpireInsertLocator {
        @Override
        public int[] Locate(CtBehavior ctBehavior) throws Exception {
            Matcher matcher = new Matcher.MethodCallMatcher(AbstractPlayer.class, "getRelic");
            int line = LineFinder.findAllInOrder(ctBehavior, matcher)[0] + 2;
            return new int[]{line};
        }
    }

    @SpireInsertPatch(locator = Locator.class, localvars = {"r"})
    public static void Insert(AbstractRelic r) {
        if (r.counter == 3) {
            r.counter++;
        }
    }
}
