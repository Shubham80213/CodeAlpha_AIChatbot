public class NLPProcessor {
    public static String getResponse(String input) {
        input = input.toLowerCase();
        if (input.contains("hello")) return "Hi there!";
        if (input.contains("name")) return "I’m a Java-based chatbot.";
        if (input.contains("help")) return "I can answer FAQs and learn new responses.";
        return "Sorry, I didn’t understand that.";
    }
}
