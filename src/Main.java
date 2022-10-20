import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
Passport passport1=new Passport(216586156,"Иван","Семенов","Евгеньевич",1985);
addPassport(passport1);
        System.out.println(getPassportByNumber(216586156));
    }
    private static Map<Integer,Passport>map=new HashMap<>();

    public static void addPassport(Passport passport) {
        map.put(passport.getNumber(),passport);
    }

    public static Passport getPassportByNumber(int number) {
        return map.get(number);
    }
}