package candidatura;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            //precisarao sofrer alterações para não entrar em loop
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        }while (continuarTentando && tentativasRealizadas<3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " +tentativasRealizadas);
        }else {
            System.out.println("Não conseguimos contato com " + candidato);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int index = 0; index < candidatos.length; index++){
            System.out.println("O candidato de numero: " + index+1 + " é " + candidatos[index]);
        }

        System.out.println("Forma abreviada: ");
        //equivalente ao for each
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe","Marcia", "Julia", "Paulo", "Augusto", "Monica", "Ana", "Joao"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o seguinte valor de salario: "+ salarioPretendido);

            if(salarioBase > salarioPretendido){
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta");
        }else{
            System.out.println("Aguardando demais candidatos");
        }
    }
}
