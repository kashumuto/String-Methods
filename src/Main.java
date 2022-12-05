public class Main {
    public static void main(String[] args) {

        String s = String.join(" ","some", "text", "here");
        System.out.println(s);

        String a = "Mom";
        String b = "mom";
        System.out.println(a.compareTo(b));

        char z = b.charAt(1);
        System.out.println(z);

        System.out.println(a.equals(b));

        System.out.println(a.equalsIgnoreCase(b));

        System.out.println();
        System.out.println(a.regionMatches(true,0,b,0,3));

        System.out.println(s.indexOf("t"));

        System.out.println(s.lastIndexOf(a));

        System.out.println(s.startsWith("some",6));

        String str = "   My name is Khan and I'm doctor  ";
        String replace = str.replace("Khan","Mehmet");
        System.out.println(replace);

        System.out.println(str.trim());

        System.out.println(str.substring(3,10));

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());




    }
}
