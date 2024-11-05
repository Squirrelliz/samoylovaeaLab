package tech.reliab.course.samoylovaea.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.reliab.course.samoylovaea.bank.entity.Bank;
import tech.reliab.course.samoylovaea.bank.entity.BankAtm;
import tech.reliab.course.samoylovaea.bank.entity.BankOffice;
import tech.reliab.course.samoylovaea.bank.entity.CreditAccount;
import tech.reliab.course.samoylovaea.bank.entity.Employee;
import tech.reliab.course.samoylovaea.bank.entity.PaymentAccount;
import tech.reliab.course.samoylovaea.bank.entity.User;
import tech.reliab.course.samoylovaea.bank.service.BankAtmService;
import tech.reliab.course.samoylovaea.bank.service.BankOfficeService;
import tech.reliab.course.samoylovaea.bank.service.BankService;
import tech.reliab.course.samoylovaea.bank.service.CreditAccountService;
import tech.reliab.course.samoylovaea.bank.service.EmployeeService;
import tech.reliab.course.samoylovaea.bank.service.PaymentAccountService;
import tech.reliab.course.samoylovaea.bank.service.UserService;
import tech.reliab.course.samoylovaea.bank.service.impl.BankAtmServiceImpl;
import tech.reliab.course.samoylovaea.bank.service.impl.BankOfficeServiceImpl;
import tech.reliab.course.samoylovaea.bank.service.impl.BankServiceImpl;
import tech.reliab.course.samoylovaea.bank.service.impl.CreditAccountServiceImpl;
import tech.reliab.course.samoylovaea.bank.service.impl.EmployeeServiceImpl;
import tech.reliab.course.samoylovaea.bank.service.impl.PaymentAccountServiceImpl;
import tech.reliab.course.samoylovaea.bank.service.impl.UserServiceImpl;

import java.time.LocalDate;

@SpringBootApplication
public class SamoylovaeaLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamoylovaeaLabApplication.class, args);

		UserService userService = new UserServiceImpl();
		User user = userService.createUser("Петров Петр Петрович", LocalDate.now(), "Программист");

		BankService bankService = new BankServiceImpl(userService);
		Bank bank = bankService.createBank("Сбербанк");

		BankOfficeService bankOfficeService = new BankOfficeServiceImpl(bankService);
		BankOffice bankOffice = bankOfficeService.createBankOffice("Офис", "Некрасова, 36", true, true,
				true, true, 500, bank);

		EmployeeService employeeService = new EmployeeServiceImpl(bankService);
		Employee employee = employeeService.createEmployee("Кассир Кассирович Кассиров", LocalDate.now(),
				"Кассир", bank, false, bankOffice, true, 30000);

		BankAtmService bankAtmService = new BankAtmServiceImpl(bankService);
		BankAtm bankAtm = bankAtmService.createBankAtm("Банкомат", "Мичурина, 52", bank, bankOffice, employee,
				true, true, 500);

		PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl(userService, bankService);
		PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(user, bank);

		CreditAccountService creditAccountService = new CreditAccountServiceImpl(userService, bankService);
		CreditAccount creditAccount = creditAccountService.createCreditAccount(user, bank, LocalDate.now(), 8,
				500000, 14, employee, paymentAccount);

		System.out.println(bank);
		System.out.println(user);
		System.out.println(bankOffice);
		System.out.println(employee);
		System.out.println(bankAtm);
		System.out.println(paymentAccount);
		System.out.println(creditAccount);
	}
}