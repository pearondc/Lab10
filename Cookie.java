class Cookie {
  private int number;
  private int bakeTemp;
  private int bakeTime;
  private Boolean isReady;

  Cookie() {
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie(int aNumber, int aBakeTemp, int aBakeTime) {
    number = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isReady = false;
  }

  Boolean getIsReady() {
    return isReady;
  }

  void setNumber(int theNumber) {
    number = theNumber;
  }

  void bake(int aBakeTemp, int aBakeTime) {
    System.out.println(number + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isReady = true;
  }
}