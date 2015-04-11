package prueba.mail;

import org.springframework.core.annotation.Order;

import javax.mail.MessagingException;

/**
 * Created by Angel Luis on 09/04/2015.
 */
public interface EnviarEmail {
    public void sendMail(String from, String to, String subject, String msg);
    public void sendMailAdjunto(String from, String to, String subject, String msg,String uriAdjunto) throws Exception;
}
