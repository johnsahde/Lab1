package lab3;

class MyPoint {
  public int x;
  public int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

  @Override
  public String toString() {
    return ("[" + x + "," + y + "]");
  }
}
