public class HelloWorld2 {
    public static void main(String[] args){
        String names = "";
        for(int i = 0; i < args.length; i++){
            String sep;
            if (i!= args.length-1){
                sep =", ";
            }
            else {
                sep = " and ";
            }
            names = names + sep + args[i];
        }
        System.out.println("Hello" + names + "!");
    }
}
