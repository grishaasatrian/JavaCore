package homework.homework10.bracechecker;

import homework.homework10.Stack;

public class BraceChecker {

    private String text;

    public BraceChecker(String text){
        this.text = text;
    }

    public void check(){
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    int last = stack.pop();
                    if(last == 0){
                        System.out.println("Error at " + i + " closed " + c + "but not opened");
                    }else{
                        char lastBracket = (char) last;
                        if(lastBracket != '('){
                            System.out.println("Error at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                    }
            }
        }
    }
}