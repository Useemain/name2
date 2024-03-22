//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int added = 1500;

        int bonus = added > 1000 ? added / 100 : 0;
        int finalBalance = startBalance + added + bonus;
        System.out.println("Итоговый счет :" + finalBalance);
        System.out.println("Бонус :" + bonus);
    }
}