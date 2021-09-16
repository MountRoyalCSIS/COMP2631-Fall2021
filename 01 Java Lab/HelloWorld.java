/**
 * This is main.
 *
 * @author jheard
 *
 */
public class HelloWorld {

    /**
     * This is main.
     */
    public static void main(String[] args) {
        MailMessage[] messages = new MailMessage[500];


        MailMessage msg = new MailMessage(1, "Yo!", "Me", "You");
        messages[0] = msg;

        messages[0].incrementNumber();
        //        msg.incrementNumber();

        msg.saveMessage();

        System.out.println("Here it is: " + msg);
    }

}
