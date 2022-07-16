class Main {
  
  public static void main(String[] args) {
    String s = "The weather is amazing today!";
    String[] sArr = s.split(" ");
    String newS = "";

    for (int i = sArr.length-1; i > -1; --i) {
      newS = newS.concat(sArr[i]).concat(" ");
    }

    System.out.println(newS);
  }
}
