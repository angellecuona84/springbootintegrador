package prueba.configuracion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.ManagedProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * Created by Angel Luis on 10/04/2015.
 */
@Component
@ConfigurationProperties
public class ConfiguracionCorreo extends JavaMailSenderImpl {

    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private int port = -1;

    @Value("${mail.username}")
    private String username;

    @Value("${mail.password}")
    private String password;

    @PostConstruct
    public void init(){
        setHost(host);
        setPort(port);
        setUsername(username);
        setPassword(password);
        setJavaMailProperties(new Properties(){{
            put("mail.smtp.auth",true);
            put("mail.smtp.starttls.enable",true);
            put("mail.smtp.ssl.trust", "smtp.gmail.com");
        }});
    }
}
