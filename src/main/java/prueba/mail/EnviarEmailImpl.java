package prueba.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import prueba.configuracion.ConfiguracionCorreo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * Created by Angel Luis on 10/04/2015.
 */
@Component
public class EnviarEmailImpl implements EnviarEmail {

    @Autowired
    private MailSender mailSender;

    @Override
    public void sendMail(String from, String to, String subject, String msg) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(msg);
        try{
            mailSender.send(message);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public void sendMailAdjunto(String from, String to, String subject, String msg, String uriAdjunto) throws Exception {
        //JavaMailSenderImpl sender = new JavaMailSenderImpl();
        //sender.setHost("mail.host.com");

        MimeMessage message = ((ConfiguracionCorreo)mailSender).createMimeMessage();

// use the true flag to indicate you need a multipart message
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo("eduaranpier@gmail.com");

        helper.setText("Check out this image!");

// let's attach the infamous windows Sample file (this time copied to c:/)
        FileSystemResource file = new FileSystemResource(new File("c:/Descargar.jpg"));
        helper.addAttachment("CoolImage.jpg", file);

            ((ConfiguracionCorreo) mailSender).send(message);

    }
}
