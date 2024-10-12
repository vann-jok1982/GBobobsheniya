package zadanie3;
//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
// Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
// а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий.

public class  Pair <T, Y>{
    private T firgst;
    private Y second;

    public Pair(T firgst, Y second) {
        this.firgst = firgst;
        this.second = second;
    }

    public T getFirgst() {
        return firgst;
    }

    public Y getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firgst=" + firgst +
                ", second=" + second +
                '}';
    }
}
