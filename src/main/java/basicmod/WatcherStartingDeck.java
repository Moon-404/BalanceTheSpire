package basicmod;

import java.util.ArrayList;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.characters.Watcher;

@SpirePatch(clz = Watcher.class, method = "getStartingDeck")
public class WatcherStartingDeck {
    public static ArrayList<String> Replace(Watcher __instance) {
        ArrayList<String> retVal = new ArrayList<>();
        retVal.add("Strike_P");
        retVal.add("Strike_P");
        retVal.add("Strike_P");
        retVal.add("Strike_P");
        retVal.add("Strike_P");
        retVal.add("Defend_P");
        retVal.add("Defend_P");
        retVal.add("Defend_P");
        retVal.add("Defend_P");
        retVal.add("Eruption");
        retVal.add("Vigilance");
        return retVal;
    }
}
