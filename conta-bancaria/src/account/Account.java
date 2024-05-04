package account;

import annotations.Size;

import java.math.BigDecimal;

public class Account {
    @Size(value = 8, message = "")
    private Integer number;
    @Size(value = 4)
    private String agency;
    private String clientName;
    private BigDecimal balance;

    public Account(Integer number, String agency, String clientName, BigDecimal balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public String getClientName() {
        return clientName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
