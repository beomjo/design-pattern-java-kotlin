package k.bs.designpatternsp.creational.builder.ja;

import lombok.Builder;

/**
 * Use LomBok Library Builder Pattern
 * */

@Builder
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
}
