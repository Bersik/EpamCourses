package block5.task1.entity;

import java.util.Date;

/**
 * Class storage of the message on the forum
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Message {

    /**
     * Author of message
     */
    private String author;

    /**
     * Topic which wrote message
     */
    private String topic;

    /**
     * Message text
     */
    private String text;

    /**
     * Date and time, when the message was left
     */
    private Date createdDate;

    /**
     * Date and time, when the message was modified
     */
    private Date lastModifiedDate;

    public Message(String author, String topic, String text, Date createdDate, Date lastModifiedDate) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public Message(String author, String topic, String text, Date createdDate) {
        this(author, topic, text, createdDate, createdDate);
    }

    public Message(String author, String topic, String text) {
        this(author, topic, text, new Date());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;

        if (getClass() == o.getClass()) {
            Message message = (Message) o;

            return author.equals(message.author) && topic.equals(message.topic) &&
                    text.equals(message.text) && createdDate.equals(message.createdDate) &&
                    lastModifiedDate.equals(message.lastModifiedDate);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + topic.hashCode();
        result = 31 * result + text.hashCode();
        result = 31 * result + createdDate.hashCode();
        result = 31 * result + lastModifiedDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", topic='" + topic + '\'' +
                ", text='" + text + '\'' +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
