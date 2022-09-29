class Main {

  public static void main(String[] args) {

    // sout + tab => System.out.println();
    // System.out.println("Blá, blá, blá");

    Data nascimento = new Data(01, 11, 2002);
    Data admissao = new Data(23, 02, 2017);


    System.out.println(nascimento.toString());
    System.out.println(admissao.toString());
    
    
    Empregado Eric = new Empregado("Eric", "Nishihira", nascimento, admissao);

    System.out.println(Eric.toString());

  }
}