package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.AbstractAnimals;
import writer.AnimalsWriter;

class AnimalsWriterTest extends AbstractSearchAnimalsManager {


    @Test
    void testAnimalsWriter() {
      try (Writer csvWriter = new FileWriter("animals.csv")) {
        AnimalsWriter writer = new AnimalsWriter();
        writer.setCsvWriter(csvWriter);
        writer.writeToFile(lions);
      } catch (IOException e) {
        fail("test failed");
      }
    }

    @Test
    public void testProperTestFormatting() {
      try (Writer csvWriter = new StringWriter()) {

        AnimalsWriter writer = new AnimalsWriter();
        writer.setCsvWriter(csvWriter);
        writer.writeToFile(lions);

        String expectedOutput = "";
        for (AbstractAnimals animals : lions) {
          expectedOutput += animals.getHeaders() + "\n" + animals.toCSV() + "\n";
        }
        assertEquals(expectedOutput, csvWriter.toString());
      } catch (Exception e) {
        fail("the test failed unexpectedly - try to write to the file ...");
      }
    }
}
