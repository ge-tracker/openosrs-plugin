package com.getracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(GeTrackerIntegrationPlugin.CONFIG_GROUP)
public interface GeTrackerIntegrationConfig extends Config
{
	@ConfigItem(
		keyName = "example",
		name = "Example config item!",
		description = "Example",
		position = 0
	)
	default boolean example()
	{
		return true;
	}
}
