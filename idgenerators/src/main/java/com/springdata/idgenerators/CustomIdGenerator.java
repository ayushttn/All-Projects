package com.springdata.idgenerators;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CustomIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor si, Object obj) throws HibernateException {
        Long id = Long.valueOf(0);
        Random random = new Random();
        id = random.nextLong(100000);
        return id;
    }
}
