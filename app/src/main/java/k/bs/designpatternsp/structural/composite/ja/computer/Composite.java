package k.bs.designpatternsp.structural.composite.ja.computer;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class Composite extends Equipment {

    ArrayList<Equipment> equipments = new ArrayList<>();

    Composite(String name) {
        super(0, name);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public int getPrice() {
        return equipments.stream()
                .map(Equipment::getPrice)
                .mapToInt(p -> (int) p)
                .sum();
    }

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }
}
