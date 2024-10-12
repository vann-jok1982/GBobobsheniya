package zadanie1;
//Написать класс Калькулятор (необобщенный),
// который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
// Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
public class Kalkulator {
    public static <T extends Number,Y extends Number> double sum(T n1, Y n2){
        return n1.doubleValue()+n2.doubleValue();
    }
    public static <T extends Number,Y extends Number> double subtract(T n1, Y n2){
            return n1.doubleValue()-n2.doubleValue();
    }
    public static <T extends Number,Y extends Number> double multiply(T n1, Y n2){
        return n1.doubleValue()*n2.doubleValue();
    }
    public static <T extends Number,Y extends Number> double divide(T n1, Y n2){
        if (n2.doubleValue()==0)throw new ArithmeticException("Деление на 0 нельзя");
        else return n1.doubleValue()/n2.doubleValue();
    }
}
