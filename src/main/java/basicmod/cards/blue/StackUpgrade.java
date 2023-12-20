package basicmod.cards.blue;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Stack;

@SpirePatch(clz = Stack.class, method = "upgrade")
public class StackUpgrade {
    public static void Prefix(Stack __instance) {
        if (!__instance.upgraded) {
            __instance.selfRetain = true;
        }
    }
}
