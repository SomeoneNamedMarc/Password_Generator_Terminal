import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random random = new Random();
       int passwordLength = 32;
       boolean includeAlphabet = true;
       boolean includeUppercase = true;
       boolean includeNumbers = true;
       boolean includeSymbols = true;
       StringBuilder password = new StringBuilder();

       ArrayList<Character> alCharactersForPassword = new ArrayList<Character>();
       ArrayList<Character> alAlphabet = new ArrayList<>(List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
       ArrayList<Character> alNumbers = new ArrayList<>(List.of('0','1','2','3','4','5','6','7','8','9'));
       ArrayList<Character> alSymbols = new ArrayList<>(List.of('*','^','/','\\','<','>','-','_',',','.','@','!','?','(',')','|','#','$','+','=',':',';','%','{','}','[',']'));
       if (includeAlphabet)
       {
           alCharactersForPassword.addAll(alAlphabet);
       }
       if (includeNumbers)
       {
           alCharactersForPassword.addAll(alNumbers);
       }
       if (includeSymbols)
       {
           alCharactersForPassword.addAll(alSymbols);
       }

        for (int i = 0; i < passwordLength; i++) {
            int charIndex = random.nextInt(alCharactersForPassword.size());
            if (includeAlphabet && includeUppercase && charIndex < 26)
            {
                if (random.nextInt(2) == 1)
                {
                    password.append(Character.toUpperCase(alCharactersForPassword.get(charIndex)));
                }
                else
                {
                    password.append(alCharactersForPassword.get(charIndex));
                }
            }
            else
            {
                password.append(alCharactersForPassword.get(charIndex));
            }
        }
        System.out.println("Password character list: " + alCharactersForPassword);
        System.out.println("Password length:         " + passwordLength);
        System.out.println("Password:                " + password);
    }
}