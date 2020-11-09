package club.cannoner.oldhits;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.ReflectionHelper.UnableToAccessFieldException;

public class EventManager {
    public static EventManager instance;
    private OldHits mod;

    private final Minecraft mc = Minecraft.getMinecraft();
    private final String[] fieldNames = { "leftClickCounter", "field_71429_W", "ag" };

    public EventManager(OldHits mod) {
        instance = this;
        this.mod = mod;
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent e) {
        try {
            ReflectionHelper.setPrivateValue(Minecraft.class, mc, 0, fieldNames);
        }
        catch (UnableToAccessFieldException ex) {
            mod.getLogger().error("Error accessing leftClickCounter", ex);
        }
    }
}
