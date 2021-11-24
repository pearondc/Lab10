class Main {
  public static void main(String[] args) {
   Sugar tree =  new Sugar();
   tree.cutOut("tree", 10);
   tree.bake(350, 12);
   tree.decorate();

   Sugar aCookie = new Sugar();
   aCookie.decorate();
  }
}