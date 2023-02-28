import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class TExample {
    public static JDA jda;

    public static void main(String[] args) {
        jda = JDABuilder
                .createDefault("MTA3OTcxNTQ3MTcyNjc1MTc2NQ.G4xLqg.5fixhA-ZPZomveo2v3gO_bC183HTe11AFzTBsc")
                .setAutoReconnect(true)
                .setStatus(OnlineStatus.DO_NOT_DISTURB)
                .build();
    }
}
