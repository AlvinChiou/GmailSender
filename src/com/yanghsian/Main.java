package com.yanghsian;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        String fromMail = "from-mail@gmail.com";
        String toMail = "to-mail@gmail.com";
        String password = "password";
        String subject = "´ú¸Õ¶l¥ó";
        String content = "https://java.net/projects/javamail/pages/Home";
        GmailSender gmailSender = new GmailSender();
        gmailSender.GmailAuth(fromMail,toMail, password, subject, content);
    }
}
