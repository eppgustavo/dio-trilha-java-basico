package operation;

import account.Account;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Random;

public class CreateAccounting {

    private static final String VERIFY_ACCOUNT_PATTERN = "\\d{8}";
    private static final String VERIFY_AGENCY_PATTERN = "\\d{4}";
    private static final BigDecimal MINIMUM_BALANCE = BigDecimal.valueOf(500);
    private static final BigDecimal MAXIMUM_BALANCE = BigDecimal.valueOf(2000);

    public Account createAccount(final Integer accountNumber, final String agency, final String name) {

        validateAccountInputPatterns(accountNumber, agency);

        BigDecimal balance = generateRandomBalance();

        return new Account(accountNumber, agency, name, balance);

    }

    private void validateAccountInputPatterns(Integer accountNumber, String agency) {
        if (!accountNumber.toString().matches(VERIFY_ACCOUNT_PATTERN) && !agency.matches(VERIFY_AGENCY_PATTERN)) {
            throw new IllegalArgumentException("O número da conta deve ter 8 caracteres e a agência deve ter 4 caracteres.");
        }
    }

    private BigDecimal generateRandomBalance() {
        final Random random = new Random();

        double randomNumber = random.nextDouble();

        return MINIMUM_BALANCE.add(MAXIMUM_BALANCE.subtract(MINIMUM_BALANCE).multiply(BigDecimal.valueOf(randomNumber)));
    }



}
