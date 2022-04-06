package com.mixamus.spring.lookup;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Condy implements ConfigurationCondition {

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return null;
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
