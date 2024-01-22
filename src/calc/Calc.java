package calc;

public class Calc {
    /**
     * Сложение
     *
     * @param a Первое слогаемое
     * @param b Второе слогаемое
     * @return Сумма слогаемых
     */
    public float sum(float a, float b) {
        return a + b;
    }

    /**
     * Вычитание
     *
     * @param a Уменьшаемое
     * @param b Вычитаемое
     * @return Разность
     */
    public float sub(float a, float b) {
        return a - b;
    }

    /**
     * Умножение
     *
     * @param a Первый множитель
     * @param b Второй множитель
     * @return Произведение
     */
    public float mul(float a, float b) {
        return a * b;
    }

    /**
     * Деление
     *
     * @param a Делимое
     * @param b Делитель
     * @return Частное
     */
    public float div(float a, float b) {
        return a / b;
    }
}
