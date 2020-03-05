/* Adam Doyle
G00335896@gmit.ie
 */
package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class StudentList {

    @BeforeAll
    static void startTest() { System.out.println("Beginning testing"); }

    @AfterAll
    static void finishTest() {
        System.out.println("Finished testing");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing " + testInfo.getDisplayName());
        System.out.println();
    }

    @Test
    @DisplayName("Test - Testing passenger title is valid")
    void testTitle() {
        Student student = new Student("Adam","G00335896@gmit.ie");
        assertEquals("Adam", student.getName());
        assertEquals("G00335896@gmit.ie", student.getEmail());
    }


}
