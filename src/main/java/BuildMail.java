import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class BuildMail {
//    public static MimeMessage createSimpleMail(Session session,String Sender,String Recipient,String title,String Content)
    public static MimeMessage createSimpleMail(Session session,String sender,String REC,String[] A)
            throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress(sender));
        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(REC));
        //邮件的标题
        message.setSubject(A[0]);
        //邮件的文本内容
        message.setContent(A[1], "text/html;charset=UTF-8");

        Thread.sleep(1000);

        //返回创建好的邮件对象
        return message;

    }
}
