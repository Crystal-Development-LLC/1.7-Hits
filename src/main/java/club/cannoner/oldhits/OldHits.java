package club.cannoner.oldhits;

import lombok.Getter;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        clientSideOnly = true
)
public class OldHits {
    public static OldHits instance;
    @Getter private Logger logger;

    public OldHits() {
        instance = this;
        logger = LogManager.getLogger("1.7 Hits");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(new EventManager(this));
    }
}
