package com.garnagaaa.lesson03.task01.app1;

import java.util.*;

/**
 * @author Aleksei Garnaga
 * Класс MathBox
 */
public class MathBox {

    private List<Number> nums = new ArrayList<>();

    /**
     * Конструктор
     * @param number Массив чисел
     */
    public MathBox(Number[] number) {
        nums.addAll(Arrays.asList(number));
    }

    /**
     * Метод возвращающий сумму элементов
     * @return Сумма элементов
     */
    public double summator() {
        double sum = 0;
        for (Number num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    /**
     * Метод выполняющий поочередное деление всех элементов
     * @param divider Делитель
     */
    public void splitter(Number divider) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i).doubleValue() / divider.doubleValue());
        }
    }

    /**
     * Метод удаления элемента из коллекции
     * @param element Элемент
     */
    public void remove(int element) {
        nums.remove((Number) element);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "nums=" + nums +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(nums, mathBox.nums);
    }

    @Override
    public int hashCode() {
        return nums.hashCode();
    }

}
