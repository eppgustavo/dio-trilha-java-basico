import account.Account;
import operation.BuildMenu;
import operation.CreateAccounting;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws IllegalArgumentException {

        System.out.println("Um prazer lhê receber como nosso cliente!");
        BuildMenu.buildMenu();

        System.out.println();

        final CreateAccounting createAccounting = new CreateAccounting();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        Integer accountNumber = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String agency = scanner.next();
        System.out.println("Por favor, digite o nome completo!");
        String clientName = scanner.next();

        Account clientAccount = createAccounting.createAccount(accountNumber, agency, clientName);

        final BigDecimal availableBalance = new BigDecimal(String.valueOf(clientAccount.getBalance()));
        final DecimalFormat formatBigDecimal = new DecimalFormat("#,##0.00");


        String accountCreatedMessage = String.format("""
                        "Olá %s, obrigado por criar uma conta em nosso banco, 
                 sua agência é %s, conta %d e seu saldo R$ %s já está disponível para saque.
        """, clientName, agency, accountNumber, formatBigDecimal.format(availableBalance));


        System.out.println(accountCreatedMessage);

        scanner.close();

    }



}