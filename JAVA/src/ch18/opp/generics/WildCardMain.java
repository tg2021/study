package ch18.opp.generics;

public class WildCardMain {
    
    public static void main(String[] args) {
        
        ChildWildCard<WildCard<String>> childWildCardStr = new ChildWildCard<WildCard<String>>();
        ChildWildCard<WildCard<Integer>> childWildCardInt = new ChildWildCard<WildCard<Integer>>();
    }
}
