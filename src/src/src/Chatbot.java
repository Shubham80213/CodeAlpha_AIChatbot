import java.util.Scanner;

public class Chatbot {
    public void startChat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("🤖 Hello! I’m your AI Chatbot. Type 'bye' to exit.");
        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("bye")) break;
            System.out.println("Bot: " + NLPProcessor.getResponse(input));
        }
        sc.close();
    }
}
