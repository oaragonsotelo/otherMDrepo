import static org.junit.Assert.*; //imports assert command used in line 8
import org.junit.*; //imports junit 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;


public class MarkdownParseTest {

    /**
     * Tests other implementation of the markdownparse java file
     * @param ExpectedOutputOne - expected output to test for
     * @param SnippetOne - File path of snippet-1.md
     * @param ContetsOne - contents of snippet-1.md
     * @param otherActualOutputOne -  stores the list returned after running other MarkdownParse
     * @throws IOException
     */
    @Test
    public void testOtherSnippet1() throws IOException{
        String expectedOutputOne = "[url.com, `google.com, google.com, ucsd.edu]";
        Path snippetOne = Path.of("snippet-1.md");
        String contetsOne = Files.readString(snippetOne);
        ArrayList<String> otherActualOutputOne = MarkdownParseOther.getLinks(contetsOne);
        assertEquals(expectedOutputOne, otherActualOutputOne.toString());

    }
    
    /**
     * Tests other implementation of the markdownparse java file
     * @param expectedOutputTwo - expected output to test for
     * @param snippetTwo - File path of snippet-2.md
     * @param contetsTwo - contents of snippet-2.md
     * @param otherActualOutputTwo -  stores the list returned after running other MarkdownParse file
     * @throws IOException
     */
    @Test
    public void testOtherSnippet2() throws IOException{
        String expectedOutputTwo = "[a.com, a.com(()), example.com]";
        Path snippetTwo = Path.of("snippet-2.md");
        String contetsTwo = Files.readString(snippetTwo);
        ArrayList<String> otherActualOutputTwo = MarkdownParseOther.getLinks(contetsTwo);

        assertEquals(expectedOutputTwo, otherActualOutputTwo.toString());
    }


    /**
     * Tests other implementation of the markdownparse java file
     * @param expectedOutputThree - expected output to test for
     * @param snippetThree - File path of snippet-3.md
     * @param contetsThree - contents of snippet-3.md
     * @param otherActualOutputThree -  stores the list returned after running other MarkdownParse file
     * @throws IOException
     */
    @Test
    public void testOtherSnippet3() throws IOException{
        String expectedOutputThree = "[https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule]";
        Path snippetThree = Path.of("snippet-3.md");
        String contetsThree = Files.readString(snippetThree);
        ArrayList<String> otherActualOutputThree = MarkdownParseOther.getLinks(contetsThree);

        assertEquals(expectedOutputThree, otherActualOutputThree.toString());
    }

}