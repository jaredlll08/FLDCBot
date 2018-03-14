package net.foldingcoin.fldcbot;

import net.darkhax.botbase.BotBase;
import net.darkhax.botbase.commands.ManagerCommands;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

/**
 * The main bot instance, used to communicate with Discord and the various bot systems.
 *
 * @author Tyler Hancock (Darkhax)
 */
public class FLDCBot extends BotBase {

    private final Configuration config;

    public FLDCBot (String botName, Configuration config) {

        super(botName, config.getDiscordToken(), config.getCommandKey(), BotLauncher.LOG);
        this.config = config;
    }

    @Override
    public void registerCommands (ManagerCommands handler) {

    }

    @Override
    public void onFailedLogin (IDiscordClient instance) {

        // No use
    }

    @Override
    public void onSucessfulLogin (IDiscordClient instance) {

        // TODO Initialize admin and moderator roles.
    }

    @Override
    public void reload () {

        // TODO This will be used in the future.
        super.reload();
    }

    @Override
    public boolean isModerator (IGuild guild, IUser user) {

        // TODO load up the moderator info
        return false;
    }

    @Override
    public boolean isAdminUser (IGuild guild, IUser user) {

        // TODO load up the admin info
        return false;
    }
}