package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
