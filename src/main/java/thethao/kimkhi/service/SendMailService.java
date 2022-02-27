package thethao.kimkhi.service;

import thethao.kimkhi.dto.MailInfo;

import javax.mail.MessagingException;
import java.io.IOException;

public interface SendMailService {

	void run();

	void queue(String to, String subject, String body);

	void queue(MailInfo mail);

	void send(MailInfo mail) throws MessagingException, IOException;

}
