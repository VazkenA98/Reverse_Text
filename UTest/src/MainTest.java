public class MainTest {
    public static void main(String[]args){

    }
    private static void testingFinalString(){
        String text = "Java is a general-purpose programming language that is class-based, object-oriented (although not a pure OO language), and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. As of 2018, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers. Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Meanwhile, others have developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).The latest version is Java SE 12, released in March 2019. Since Java 9 is no longer supported, Oracle advises its users to immediately transition to Java 12. Oracle released the last public update for the legacy Java 8 LTS, which is free for commercial use, in January 2019. Java 8 will be supported with public updates for personal use up to at least December 2020. Oracle and others highly recommend that you uninstall older versions of Java because of serious risks due to unresolved security issues. Oracle extended support for Java 6 ended in December 2018.";
        //String text = "hello my name is java and i love you";
        ReverseString[] reverseClass = new ReverseString[4];
        System.out.println(text.length());
        reverseClass[0] = new ReverseString(text, 0, text.length() / 4);
        reverseClass[1] = new ReverseString(text, text.length() / 4, (2 * text.length()) / 4);
        reverseClass[2] = new ReverseString(text, (2 * text.length()) / 4, (3 * text.length()) / 4);
        reverseClass[3] = new ReverseString(text, (3 * text.length()) / 4, text.length());
        for (int i = 0; i < reverseClass.length; i++) {
            reverseClass[i].start();
            try {
                reverseClass[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        assert new ReverseString().reverseString(new ReverseString().reversedFullString()).equals(text) : "true";

    }
}
