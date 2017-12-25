/**
 * Created by elenakharchenko on 12/16/17.
 */
public class Variables {
    int VariableName;
    int Age = 37;
    String name = "Lena";
    Boolean a = true;
    boolean b;
    byte bb;

    //int a

    int n = 0;}
}


}
class Main {

    public static void main(String args[]) {

        Calendar calendar1 = Calendar.getInstance();
        int currentDayofYear = calendar1.get(Calendar.DAY_OF_YEAR);

        int year = calendar1.get(Calendar.YEAR);

        Calendar calendar2 = new GregorianCalendar(year, 11, 31);
        int dayDecember31 = calendar2.get(Calendar.DAY_OF_YEAR);

        int days = dayDecember31 - currentDayofYear;
        System.out.println(days + " days remain in current year");
    }
}
