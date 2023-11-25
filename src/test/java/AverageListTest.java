import org.example.AverageList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class AverageListTest {
    @Test
    public void AverageOfList() {

        AverageList buba = new AverageList(new int[]{3, 4, 3, 6});

        assertThat(buba.AverageOfAverageList()).isEqualTo(4);
    }

        @Test
        public void AverageOfListNullList() {

            AverageList buba = new AverageList(new int[]{});

            assertThat(buba.AverageOfAverageList()).isEqualTo(0);
    }



    @Test
    public void ComposeEqualLists() {
        AverageList buba2 = new AverageList(new int[]{4, 4, 4, 4});
        AverageList drakon2 = new AverageList(new int[]{4, 4});



        assertThat(buba2.WhatAverageListIsBigger(drakon2)).isEqualTo("Средние значения равны");


    }


    @Test
    public void ComposeOFAverageOfLists() {
        AverageList buba = new AverageList(new int[]{3, 4, 3, 6});

        AverageList drakon = new AverageList(new int[]{8, 9, 10, 11});
        assertThat(buba.WhatAverageListIsBigger(drakon)).isEqualTo("Второй список имеет большее среднее значение");


    }


}