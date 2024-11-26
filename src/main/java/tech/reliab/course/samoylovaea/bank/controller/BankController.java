package tech.reliab.course.samoylovaea.bank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.reliab.course.samoylovaea.bank.entity.Bank;
import tech.reliab.course.samoylovaea.bank.service.BankService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/banks")
public class BankController {

    private final BankService bankService;

    @PostMapping
    public ResponseEntity<Bank> createBank(String bankName) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bankService.createBank(bankName));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBank(int id) {
        bankService.deleteBank(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Bank> updateBank(int id, String bankName) {
        return ResponseEntity.ok(bankService.updateBank(id, bankName));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bank> getBankById(int id) {
        return ResponseEntity.ok(bankService.getBankDtoById(id));
    }

    @GetMapping
    public ResponseEntity<List<Bank>> getAllBanks() {
        return ResponseEntity.ok(bankService.getAllBanks());
    }
}
