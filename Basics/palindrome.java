class palindrome {
  public static void main(String[] args) {
        isPalin("Radar");
    }
    public static String isPalin(String str){
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString().equals(str) ? "String is a palindrome." : "String is not a palindrome.";
    }
}
