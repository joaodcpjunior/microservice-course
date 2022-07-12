package com.joaodcpjunior.hrpayroll.services;

import com.joaodcpjunior.hrpayroll.entities.Payment;
import com.joaodcpjunior.hrpayroll.entities.Worker;
import com.joaodcpjunior.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPaymente(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
