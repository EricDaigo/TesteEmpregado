public class Data {

  private int dia;
  private int mes;
  private int ano;

  private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public Data(int dia, int mes, int ano) {

    if (mes <= 0 || mes > 12) {

      throw new IllegalArgumentException("Mês (" + mes + ") deve estar entre 1 - 12");

    }

    if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {

      throw new IllegalArgumentException("Dia (" + dia + ") foge dos parâmetros para o mês especificado");

    }

    if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {

      throw new IllegalArgumentException("Dia (" + dia + ") Foge dos parâmetros para o mês especificado");

    }

    this.dia = dia;
    this.mes = mes;
    this.ano = ano;

    //System.out.println("Construtor do objeto Data " + this);

  }

  public String toString() {

    return String.format("%d / %d / %d", dia, mes, ano);

  }
}