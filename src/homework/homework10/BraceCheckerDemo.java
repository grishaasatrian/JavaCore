package homework.homework10;

import homework.homework10.bracechecker.BraceChecker;

public class BraceCheckerDemo {

    public static void main(String[] args) {
        String text = "(Hello) {Java]";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}