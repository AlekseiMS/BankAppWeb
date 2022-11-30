package com.kluevja.bankappweb.repositories;

import com.kluevja.bankappweb.models.Account;
import com.kluevja.bankappweb.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccoutRepository extends JpaRepository<Account, Long> {
}
