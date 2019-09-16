package k.bs.designpatternsp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import k.bs.designpatternsp.pattern.builder.ja.NutritionFacts;
import k.bs.designpatternsp.pattern.builder.ja.Student;
import k.bs.designpatternsp.pattern.builder.ja.User;
import lombok.experimental.var;
import lombok.val;

public class TestGround {

    @Test
    public void buildTest() {
        Student student = new Student.Builder("qjatjr1108", "1234")
                .name("bsjo")
                .address("Junghwa 1-dong, Jungnang-gu, Seoul, Korea")
                .phoneNumber("010-1234-1234")
                .build();
    }

    @Test
    public void lombokTest() {
        //chain
        NutritionFacts facts = NutritionFacts.builder()
                .calories(230)
                .fat(10)
                .build();


        //not chain
        NutritionFacts.NutritionFactsBuilder nutritionFactsBuilder = NutritionFacts.builder();
        nutritionFactsBuilder.calories(230);
        nutritionFactsBuilder.fat(10);
        NutritionFacts nutritionFacts = nutritionFactsBuilder.build();

    }

    @Test
    public void valVarTest() {
        val arrVal = Arrays.asList(1, 2, 3, 4, 5);
        arrVal = new ArrayList<>(); // compile error

        var arrVar = Arrays.asList(1, 2, 3, 4, 5);
        arrVar = new ArrayList<>();
    }


}
