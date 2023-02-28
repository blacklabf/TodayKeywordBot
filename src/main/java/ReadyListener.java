import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;


public class ReadyListener implements EventListener
{
    public static void main(String[] args)
            throws InterruptedException
    {

        JDA jda = JDABuilder.createDefault("MTA3OTcxNTQ3MTcyNjc1MTc2NQ.G4xLqg.5fixhA-ZPZomveo2v3gO_bC183HTe11AFzTBsc")
                .addEventListeners(new ReadyListener())
                .build();


        ((JDA) jda).awaitReady(); //비동기처리?
    }
    @Override
    public void onEvent(GenericEvent event)
    {
        if (event instanceof ReadyEvent)
            System.out.println("API is ready!");
    }
}
