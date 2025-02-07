import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TestJavaBot extends TelegramLongPollingBot {
   private final String botToken = "7862329243:AAGAH79ztpwodXQJUbd-fQgk4MsG-MtIJSc";
   private final String botUsername = "TestJavaBot";

   public TestJavaBot(){

   }

   @Override
   public void onUpdateReceived(Update update){

   }

   @Override
    public String getBotUsername(){
       return this.botUsername;
   }

   @Override
    public String getBotToken(){
       return this.botToken;
   }
}
