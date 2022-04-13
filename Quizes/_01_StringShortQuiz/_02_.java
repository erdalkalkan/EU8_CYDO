package _01_StringShortQuiz;

public class _02_ {
    public static void main(String[] args) {

        String ta= "A";
        ta=ta.concat("B");
        String tb= "C";
        ta=ta+tb;
        ta.replace('C','D');  //ta=ABC  C,D olmama nedenini bilmiyorum
        ta=ta+tb;
        System.out.println(ta);


    }
}
