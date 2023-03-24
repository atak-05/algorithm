

public class metods {
    public static void main(String[] args) {
        // non parametres metods
        hello();
        helloParams("Parametreli Metods");
        int number = 5;
        System.out.println( number+"! is factorial "+ factorial(number));
    }

    // * private bir metot sadece bağlı bulunduğu sınıf tarafından erişilebilirdir!
    // */
    // * Eğer herhangi bir değer return etmiycekse void olarak belirtmeliyiz!

    

    // parametresis ve geriye bir değer döndürmeyen metot örnegidir.
    private static void hello() {
        System.out.println("Parametresiz Metods!");
    }

    // parametreli ama geriye değer döndürmeyen metot örnegidir.
    private static void helloParams(String string) {
        System.out.println(string);

    }
    //parametreli ve returnlu metod örnegidir.
    private static int factorial(int number) {

        int f =1 ;
        for (int i = 1; i <= number; i++){
            f*=i;
        }
        return f; 
    }
   


}
