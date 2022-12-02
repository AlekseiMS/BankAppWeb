package com.kluevja.bankappweb.services;

import com.kluevja.bankappweb.models.Account;
import com.kluevja.bankappweb.models.Client;
import com.kluevja.bankappweb.models.Role;
import com.kluevja.bankappweb.repositories.AccountRepository;
import com.kluevja.bankappweb.repositories.ClientRepository;
import com.kluevja.bankappweb.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AccountRepository accountRepository;
    public boolean createAccount(Account account,Long clientId) {
        account.setBalans(0);
        accountRepository.save(account);//Сохранит в БД счет с нулувым балансом
        Client clientForEdit = clientRepository.getById(clientId);
        clientForEdit.getAccounts().add(accountRepository.findTopByOrderByIdDesc());
        clientRepository.save(clientForEdit);
        return true;
    }

    public Optional<Account> getClient(Long id) {

        return accountRepository.findById(id);
    }

    public boolean updateAccount(Client client) {
//        Client clientForChange = clientRepository.findById(client.getId()).get();
//        clientForChange.setName(client.getName());
//        clientForChange.setSurname(client.getSurname());
//        clientForChange.setPatronymic(client.getPatronymic());
//        clientForChange.setPassword(client.getPassword());
//        clientRepository.save(clientForChange);
        return true;
    }

    public boolean deleteAccount(Long id) {
        accountRepository.delete(accountRepository.findById(id).get());
        return true;
    }
}