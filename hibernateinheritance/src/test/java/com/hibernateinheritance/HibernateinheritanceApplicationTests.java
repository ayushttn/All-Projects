package com.hibernateinheritance;

import com.hibernateinheritance.Repos.PaymentRepository;
import com.hibernateinheritance.entities.Check;
import com.hibernateinheritance.entities.CreditCard;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class HibernateinheritanceApplicationTests {

    @Autowired
    PaymentRepository paymentRepository;

    @Test
    public void createPayment() {
        CreditCard cc = new CreditCard();
        cc.setId(123);
        cc.setAmount(1000);
        cc.setCardnumber("1234567890");
        paymentRepository.save(cc);
    }

    @Test
    public void createCheckPayment() {
        Check ch = new Check();
        ch.setId(124);
        ch.setAmount(1000);
        ch.setChecknumber("1234567890");
        paymentRepository.save(ch);
    }

}
