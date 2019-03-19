import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import java.util.Properties;

public class SinaMailtask implements Runnable{
    String sender;
    String passwprd;
    String REC;
    String[] BasicMessage;

    public SinaMailtask(String[] BasicMessage,String sender,String REC,String passwprd){
        this.BasicMessage = BasicMessage;
        this.sender = sender;
        this.REC = REC;
        this.passwprd = passwprd;

    }
    public void Sendmail() throws Exception {
        Properties prop = new Properties();
        prop.setProperty("mail.host", sender);
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        prop.setProperty("mail.smtp.ssl.enable","true");
        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(prop);
        //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
        session.setDebug(true);
        Transport ts = null;
        ts = session.getTransport();

        //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
//        ts.connect("smtp.qq.com",465, "879696519@qq.com", "txyahcbmmrzjbdhg");

        ts.connect("smtp.sina.com", sender, passwprd);

        //4、创建邮件
        Message message = BuildMail.createSimpleMail(session,sender,REC,BasicMessage);
        //5、发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
    }

    public void run(){
        try {
            Sendmail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
