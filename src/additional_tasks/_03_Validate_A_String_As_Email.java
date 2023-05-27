package additional_tasks;

public class _03_Validate_A_String_As_Email {

    /*
    Write a method that takes a String and returns true or false
    If it is a valid email in the format of <2+chars>@<2+chars>.<2+chars>

    Test Data:
    johndoe@gmail.com

    Expected Output:
    true

    One of the ways
    str.length() - 1 != str.removeAll("@").length()
     */

    //Solution without regex
    public static boolean validateEmail(String str){
        if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8
        || str.indexOf("@") != str.lastIndexOf("@")) return false;


        return str.substring(0, str.indexOf("@")).length() >= 2
                && str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2
                && str.substring(str.lastIndexOf(".")+1).length() >= 2;
    }




    public static void main(String[] args) {
        System.out.println(validateEmail("")); // false
        System.out.println(validateEmail("johndoe")); // false
        System.out.println(validateEmail("johndoe@gmail")); // false
        System.out.println(validateEmail("johndoe@gmail.")); // false
        System.out.println(validateEmail("johndoe@gmail.c")); // false
        System.out.println(validateEmail("johndoe@g.com")); // false
        System.out.println(validateEmail("j@gmail.com")); // false
        System.out.println(validateEmail("@gmail.com")); // false
        System.out.println(validateEmail("a@b.c")); // false
        System.out.println(validateEmail("abc@gmail.com")); // true
    }


}
