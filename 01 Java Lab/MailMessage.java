import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Holds a single mail message.
 *
 * @author Jason
 */
public class MailMessage {

    /**
     * Construct a mail message.
     */
    public MailMessage(int number, String subject, String sender, String recipient) {
        super();
        this.number = number;
        this.subject = subject;
        this.sender = sender;
        this.recipient = recipient;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "MailMessage [number=" + number + ", subject=" + subject + ", sender=" + sender + ", recipient="
                + recipient + "]";
    }

    /**
     * Increase the message number for reasons.
     */
    public void incrementNumber() {
        this.number++;
    }

    /**
     * Saves the message to a file.
     */
    public void saveMessage() {
        PrintStream output = null;
        try {
            output = new PrintStream("out.txt");

            output.println(this.toString());
        } catch (FileNotFoundException exception) {
            System.err.println("So sad...");
        } finally {
            output.close();
        }

    }

    private int number;
    private String subject;
    private String sender;
    private String recipient;

}
