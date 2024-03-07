package com.ebao.cloud.domain;

import com.insuremo.appframework.context.AppContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Objects;
import java.util.Optional;

@Configuration
public class UserAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(getCurrAuditor());
    }

    public static String getCurrAuditor() {
        String currentUser = AppContext.getUserName();
        return Objects.requireNonNullElse(currentUser, AppContext.getTenantCode() + ":system");
    }
}
