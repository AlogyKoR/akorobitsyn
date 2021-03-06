package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(new int[]{5, 1, 2, 7, 3});
        int[] expected = new int[]{1, 2, 3, 5, 7};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
        int[] expected = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }
}