package basicmod.cards.green;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.green.Envenom;

@SpirePatch(clz = Envenom.class, method = "upgrade")
public class EnvenomUpgrade {
    public static void Replace(Envenom __instance) {
        if (!__instance.upgraded) {
            try {
                Method method = AbstractCard.class.getDeclaredMethod("upgradeName");
                method.setAccessible(true);
                method.invoke(__instance);
                method = AbstractCard.class.getDeclaredMethod("upgradeBaseCost", int.class);
                method.setAccessible(true);
                method.invoke(__instance, 0);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
