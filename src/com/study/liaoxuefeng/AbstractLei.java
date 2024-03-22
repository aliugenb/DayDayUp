package com.study.liaoxuefeng;

//抽象类
public class AbstractLei {
    public static void main(String[] args) {
        double total = 0;
        IncomeMoney[] incomeMoneys = {new FirstIncome(7500), new SecondIncome(10000)};
        for (IncomeMoney incomeMoney : incomeMoneys) {
            total = total + incomeMoney.getTax();
        }
        System.out.println(total);
    }
}


abstract class IncomeMoney {
    protected double income;

    public abstract double getTax();
}

class FirstIncome extends IncomeMoney {
    public FirstIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        if (this.income < 5000) {
            return 0;
        }
        return (this.income - 5000) * 0.2;
    }
}

class SecondIncome extends IncomeMoney {
    public SecondIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        return 0;
    }
}
