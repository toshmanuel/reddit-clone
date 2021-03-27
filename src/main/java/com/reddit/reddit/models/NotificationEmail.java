package com.reddit.reddit.models;

import com.liferay.portal.kernel.mail.MailMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail extends MailMessage {
    private String subject;
    private String recipient;
    private String body;
}
