class App {


  

  // Entry Point do programa
  // Método main (principal)
  public static void main(String... args) {
    // string literal
    System.out.println("Funcionando...");
    // primitivo: inicia com letra minúscula
    int a = 2; // 32 bits
    double b = 3.4; // 64 bits
    float c = 4.5F; // 32 bits
    long d = 243234234233L; // 64 bits
    boolean e = true;
    byte f = 122; // 8bits
    char g = 'b'; // character = carácter
    int h = 'e';
    char i = 105;
    System.out.println(i); // i
    // se i está entre 'a' e 'f'
    if (i >= 97 && i <= 102) {
      System.out.println("i está entre a e f");
    }
    String j = "u"; // ['u']

    String teste = "tads";
    System.out.println(Texto.primeiraLetra(teste));
    char p = Texto.primeiraLetra(teste);
    // casos de entrada inválida
    System.out.println(Texto.primeiraLetra(""));
    System.out.println(Texto.primeiraLetra(null));
    String teste2 = null;
    System.out.println(Texto.primeiraLetra(teste2));
                                        //0123
    System.out.println(Texto.ultimaLetra("tads")); // s
                                        //0123456
    System.out.println(Texto.ultimaLetra("modular")); // r
    System.out.println(Texto.ultimaLetra("")); // \0
    System.out.println(Texto.ultimaLetra(null)); // \0

  }
}
