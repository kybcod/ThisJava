package Check09.ex07;

public class Chatting {
    class Chat{
        void start(){}
        void sendMessage(String message){}
    }

    void startChat(String chatId){
        String nickName = chatId;

        Chat chat = new Chat(){
            @Override
            void start() {
                while (true){
                    String inputData = "안녕하세요";
                    String message = "["+nickName+"]"+inputData;
                    //Variable 'nickName' is accessed from within inner class,
                    // needs to be final or effectively final
//                    String message = "["+ nickName +"]"+inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
