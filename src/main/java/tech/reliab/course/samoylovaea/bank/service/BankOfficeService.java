package tech.reliab.course.samoylovaea.bank.service;

import tech.reliab.course.samoylovaea.bank.entity.Bank;
import tech.reliab.course.samoylovaea.bank.entity.BankOffice;

import java.util.List;
import java.util.Optional;

public interface BankOfficeService {

    BankOffice createBankOffice(String name, String address, boolean canPlaceAtm,
                                boolean canIssueLoan, boolean cashWithdrawal, boolean cashDeposit,
                                double rentCost, Bank bank);

    Optional<BankOffice> getBankOfficeById(int id);

    List<BankOffice> getAllBankOffices();

    void updateBankOffice(int id, String name);

    void deleteBankAtm(int officeId, int bankId);
}