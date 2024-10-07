public class HelloWorld2 {
    public static void main(String[] args){
        StringBuilder names = new StringBuilder();
        for(int i = 0; i < args.length; i++){
            String sep;
            if (i!= args.length-1){
                sep =", ";
            }
            else {
                sep = " and ";
            }
            names.append(sep).append(args[i]);
        }
        System.out.println("Hello" + names + "!");
    }
}
