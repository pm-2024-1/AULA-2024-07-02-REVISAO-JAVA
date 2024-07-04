class Texto {

  

  // assinatura do método (contrato)
  // sai/retorna // entra/parâmetro
  static char primeiraLetra(String str) {
    if (str == null) {
      return '\0';
    }
    if (str.length() == 0) {
      return '\0';
    }

    // 0123
    // str = "tads"
    char primeira = str.charAt(0);
    return primeira;
  }
    
}
