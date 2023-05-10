package dasz;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class SampleTest {

    private static void doTest(String str, String expected) {
        assertEquals(expected, Kata.incrementString(str), "input: <"+str+">");
    }

    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
        doTest("0000000000000472425459902571340539291", "0000000000000472425459902571340539292");
    }
}