package com.joaodcpjunior.hrpayroll.services;

import com.joaodcpjunior.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPaymente(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
