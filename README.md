# 1.7 Hits
A Minecraft Forge mod for 1.8.9 that effectively removes the swing cooldown timer added between versions 1.7.10 and 1.8.

Be warned that servers may consider this mod to be a cheat/hack so it's use at your own risk. It is always best to check with the administrators of the server you plan to use it on first.

### Installation
The mod is installed the same way as any other Forge mod.

Download the `.jar` file from the releases section of this repository and drag it into `/.minecraft/mods`.

Requires Minecraft Forge 1.8.9, you can download it [here](https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.8.9.html).

### Technical Information
The `net.minecraft.client.Minecraft` class contains an integer field called `leftClickCounter`. If this counter is not 0 or lower, the player cannot attack. Whenever the player attacks and misses an entity, this counter is set to 10. It is then decremented by 1 every client tick, eventually returning to 0 and allowing an attack. 

This mod works by setting `leftClickCounter` to 0 every client tick utilizing Forge's `ReflectionHelper` class, effectively removing the behaviour and helping restore the feel of 1.7 PvP.