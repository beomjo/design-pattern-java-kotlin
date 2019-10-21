package k.bs.designpatternsp.creational.prototype.ja;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class ProtoTypeServiceTest {
    private static final String TEST = "TEST";

    MessageBox starBox = new MessageBox("*");
    MessageBox underlineBox = new MessageBox("_");

    private PrototypeService prototypeService = new PrototypeService();

    @Before
    public void before() {
        prototypeService.register("starBox", starBox);
        prototypeService.register("underlineBox", underlineBox);
    }

    @Test
    public void create_messageBox() {
        // given

        // when
        Product result = prototypeService.clone("starBox");

        // then
        assertThat(result.use(TEST), is("*TEST*"));
        assertThat(result.getClass().toString(), is(starBox.getClass().toString()));
        assertThat(result.hashCode(), not(starBox.hashCode()));
        assertThat(result.maps.hashCode(), is(starBox.maps.hashCode()));
    }

    @Test
    public void create_underLineBox() {
        // given

        // when
        Product result = prototypeService.clone("underlineBox");

        // then
        assertThat(result.use(TEST), is("_TEST_"));
        assertThat(result.getClass().toString(), is(underlineBox.getClass().toString()));
        assertThat(result.hashCode(), not(underlineBox.hashCode()));
        assertThat(result.maps.hashCode(), is(underlineBox.maps.hashCode()));
    }
}
