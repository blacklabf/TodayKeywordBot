import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class TExample {
    public static JDA jda;

    public static void main(String[] args) {
        jda = JDABuilder
                .createDefault("token")
                .setAutoReconnect(true)
                .setStatus(OnlineStatus.DO_NOT_DISTURB)
                .build();
    }
}
