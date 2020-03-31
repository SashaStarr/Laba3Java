package writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import model.AbstractAnimals;

public class AnimalsWriter {
  private Writer csvWriter;
  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }
  public void writeToFile(List<AbstractAnimals> animals) throws IOException {
    for (AbstractAnimals animal : animals) {
      csvWriter.write(animal.getHeaders());
      csvWriter.write("\n");
      csvWriter.write(animal.toCSV());
      csvWriter.write("\n");
      csvWriter.flush();
    }
  }
}
