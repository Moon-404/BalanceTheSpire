package basicmod.events;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.events.city.Vampires;

@SpirePatch(clz = Vampires.class, method = SpirePatch.CONSTRUCTOR)
public class VampiresDescription {
    public static void Prefix(Vampires __instance) {
        Vampires.OPTIONS[0] = "[接受] #g移除所有 打击 #g牌。 #g获得等量 噬咬 #g牌。 #r失去 #r";
        Vampires.OPTIONS[4] = "] #g移除所有 打击 #g牌。 #g获得等量 噬咬 #g牌。";
    }
}
