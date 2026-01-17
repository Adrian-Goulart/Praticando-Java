package praticandoJava.pastas.bankTranference.domain;

import praticandoJava.pastas.bankTranference.exceptions.InvalidValueException;
import praticandoJava.pastas.bankTranference.exceptions.UltrapassedValueException;

import java.security.InvalidAlgorithmParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    public String name;
    public String lastName;
    public int age;
    private double balance;

    public User(String name, String lastName, int age, double balance) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit() {
        double quantity;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Quando a depositar?");
            quantity = sc.nextDouble();
            if (quantity <= 0) {throw new InvalidValueException();}

            System.out.println("Calculando...");
            setBalance(this.balance += quantity);

        } catch (NullPointerException | InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Valor inválido");

        } catch (RuntimeException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Finalizado");
            System.out.println("Dinheiro na conta: " + getBalance());
        }
    }

    public void withdraw() {
        double quantity;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Quando a sacar?");
            quantity = sc.nextDouble();
            if (quantity > this.balance) {throw new UltrapassedValueException();}
            if (quantity <= 0) {throw new InvalidValueException();}

            System.out.println("Calculando...");
            setBalance(this.balance -= quantity);

        } catch (NullPointerException | InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Valor inválido, nulo ou caractere indevido");

        } catch (RuntimeException e) {
            e.printStackTrace();

        }finally {
            System.out.println("Finalizado");
            System.out.println("Valor na conta: " + getBalance());
        }
    }
}
