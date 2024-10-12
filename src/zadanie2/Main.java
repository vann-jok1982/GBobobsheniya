package zadanie2;
//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
// и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
public class Main {
    public static void main(String[] args) {
        Integer[] mas1={2,4,6,8};
        Integer[] mas2={1,3,5,7};
        System.out.println(compareArrays(mas1,mas2));
    }
    public static <T> boolean compareArrays(T[] mas1,T[] mas2){
        boolean flag;
        if (mas1.length==mas2.length){
            flag=true;
            for (int i = 0; i < mas1.length; i++) {
                if (!mas1[i].getClass().equals(mas2[i].getClass())) flag=false;
            }
        }else flag=false;
        return flag;
    }
}
