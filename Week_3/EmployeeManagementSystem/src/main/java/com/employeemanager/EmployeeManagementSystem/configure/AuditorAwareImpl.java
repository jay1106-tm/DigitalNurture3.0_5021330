package com.employeemanager.EmployeeManagementSystem.configure;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    @NonNull
    public Optional<String> getCurrentAuditor(){
        return Optional.ofNullable("System");
    }
}
