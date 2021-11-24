class Sugar extends Cookie {
  String shape;
  Boolean isDecorated;

  Sugar() {
    shape = "";
    isDecorated = false;
  }

  Sugar(String aShape) {
    isDecorated = false;
  }

  String getShape() {
    return shape;
  }

  void setShape(String theShape) {
    shape = theShape;
  }

  void cutOut(String shape, int number) {
    System.out.println(number + " cookies were cut into " + shape);
    super.setNumber(number);
  }

  void decorate() {
    if(getIsReady() == true) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}
