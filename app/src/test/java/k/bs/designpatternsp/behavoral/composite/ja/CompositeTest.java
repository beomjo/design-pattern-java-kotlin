package k.bs.designpatternsp.behavoral.composite.ja;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import k.bs.designpatternsp.structural.composite.ja.computer.HardDrive;
import k.bs.designpatternsp.structural.composite.ja.computer.Memory;
import k.bs.designpatternsp.structural.composite.ja.computer.PersonalComputer;
import k.bs.designpatternsp.structural.composite.ja.computer.Processor;

public class CompositeTest {

    @Test
    public void compositionTest() {
        PersonalComputer pc = new PersonalComputer("PC");

        pc.add(new Processor(1000, "Intel"));
        pc.add(new Memory(500, "8GB"));
        pc.add(new HardDrive(800, "SSD"));

        Assert.assertThat(pc.getName(), CoreMatchers.is("PC"));
        Assert.assertThat(pc.getPrice(), CoreMatchers.is(2300));
    }
}
