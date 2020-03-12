

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sendmail.Credientials;
import sendmail.OTP;

/**
 * Servlet implementation class Sendmail
 */
public class Sendmail extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email=request.getParameter("email");
		//acess otp by other class using object
	     OTP ot=new OTP();
		int otp1=ot.OTP();
		String notp=Integer.toString(otp1);
		System.out.println(otp1+" "+notp);
		
						String fromEmail=Credientials.email; //sender's mail id.
						String pwd=Credientials.password;		//sender's mail pw	d.
						
						String toEmail=email;  //reciever's mail id.
						
						String subject="DO NOT REPLY: Mail from Java Program"; // mail subject line
						String msg="Hi"+ email +" ,I have sent this mail using java program."+notp; //mail body
						
						//Creating Session Object
						Properties prop = new Properties();
						prop.put("mail.smtp.host", "smtp.gmail.com");
						prop.put("mail.smtp.port", 587);
						prop.put("mail.smtp.auth", "true");    //authentication purpose
						prop.put("mail.smtp.starttls.enable", "true");

						Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator()
						{
							protected PasswordAuthentication getPasswordAuthentication()
							{
								//sender's mail id and pwd is encapsulated inside "SendersCredentials.java"
								return new PasswordAuthentication(fromEmail, pwd);
							}
						});

						try
						{
						//Composing the Mail
						MimeMessage mesg = new MimeMessage(session);
						mesg.setFrom(new InternetAddress(fromEmail));
						mesg.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
						mesg.setSubject(subject);  
						mesg.setText(msg);  
						
						//Sending the Mail
						Transport.send(mesg);
						System.out.println("Mail Sent!!");
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
	    }
	}


