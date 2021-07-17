import java.util.ArrayList;
import java.util.Arrays;

class CustomException extends Exception {
    public CustomException(String message) {

        super(message);
    }
}

class CustomExceptionUser {

    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));


    public void checkLanguage(String language) throws CustomException {


        if(languages.contains(language)) {
            throw new CustomException(language + " already exists");
        }
        else {

            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }

    public static void main(String[] args) {


        CustomExceptionUser c = new CustomExceptionUser();

        try {
            c.checkLanguage("python");
            c.checkLanguage("Java");
        }

        catch(CustomException e) {
            System.out.println("[" + e + "] Exception Occured");
        }
    }
}