package com.hsf.hsf.config;

import com.hsf.hsf.beans.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfig {

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setInitial(1000);
        sequenceGenerator.setPrefix("30");
        sequenceGenerator.setSuffix("A");

        return sequenceGenerator;
    }

}
