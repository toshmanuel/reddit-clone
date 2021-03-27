package com.reddit.reddit;

import com.liferay.mail.model.Filter;
import com.liferay.mail.service.MailService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.mail.MailMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.mail.Session;
import java.util.List;

@SpringBootApplication
public class RedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Bean
    public MailService getMailService() {
        return new MailService() {
            @Override
            public void addForward(long l, long l1, List<Filter> list, List<String> list1, boolean b) {

            }

            @Override
            public void addUser(long l, long l1, String s, String s1, String s2, String s3, String s4) {

            }

            @Override
            public void addVacationMessage(long l, long l1, String s, String s1) {

            }

            @Override
            public void clearSession() {

            }

            @Override
            public void deleteEmailAddress(long l, long l1) {

            }

            @Override
            public void deleteUser(long l, long l1) {

            }

            @Override
            public Session getSession() throws SystemException {
                return null;
            }

            @Override
            public void sendEmail(MailMessage mailMessage) {

            }

            @Override
            public void updateBlocked(long l, long l1, List<String> list) {

            }

            @Override
            public void updateEmailAddress(long l, long l1, String s) {

            }

            @Override
            public void updatePassword(long l, long l1, String s) {

            }
        };
    }

}
