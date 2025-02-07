package nm.rc;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.Message;

public class TestJavaBot extends TelegramLongPollingBot {
   private final String botToken = "7862329243:AAGAH79ztpwodXQJUbd-fQgk4MsG-MtIJSc";
   private final String botUsername = "nm.rc.TestJavaBot";

   public TestJavaBot(){

   }

   @Override
   public void onUpdateReceived(Update update){
      if(update.hasMessage()){
         Message message = update.getMessage();

         String username = message.getFrom().getUserName();
         //String textMessage = message.getText();
         String chatID = String.valueOf(message.getChatId());

         SendMessage sendMessage = new SendMessage();

         sendMessage.setChatId(chatID);
         sendMessage.setText("Ваше повідомлення отримано " + "@" + username);

         try{
            execute(sendMessage);
         }catch(Exception e){
            e.printStackTrace();
         }
      }
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
