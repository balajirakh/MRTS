package com.BikkatIT.MassRapidTransistSystem.Service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.BikkatIT.MassRapidTransistSystem.entity.Customer;
@Service
public class EmailService {
	public void sendOTP(Customer customer) {
        // Generate a random OTP (4-digit)
        String otp = generateOTP();

        // Email properties
        String host = "your.smtp.host"; // SMTP host
        String port = "587"; // SMTP port
        String senderEmail = "your-email@example.com"; // Sender's email address
        String senderPassword = "your-email-password"; // Sender's email password

        // Setting up properties for SMTP server
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Authenticator object to authenticate the sender's email and password
        Authenticator auth = new Authenticator() {
        	@Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail,senderPassword);
            }
        
        };
        // Creating a session with authentication
      
        Session session = Session.getInstance(props, auth);

        try {
            // Creating a message object
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(senderEmail));
            message.setSubject("Your OTP for registration");
            message.setText("Your OTP is: " + otp);

            // Sending the email
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    // Method to generate a random 4-digit OTP
    private String generateOTP() {
        int otpLength = 4;
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < otpLength; i++) {
            otp.append((int) (Math.random() * 10));
        }

        return otp.toString();
    }

}
