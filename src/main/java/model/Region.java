package model;

public class Region {
  private String partOfTheArea;
  private Climat climat;

  public String getPartOfTheArea() {
    return partOfTheArea;
  }

  public void setPartOfTheArea(String partOfTheArea) {
    this.partOfTheArea = partOfTheArea;
  }

  public Climat getClimat() {
    return climat;
  }

  public void setClimat(Climat climat) {
    this.climat = climat;
  }

  public Region(String partOfTheArea, Climat climat) {
    this.partOfTheArea = partOfTheArea;
    this.climat = climat;
  }

}