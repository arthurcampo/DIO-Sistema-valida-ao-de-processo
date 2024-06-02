

public class ProcessoSeletivo {
	public static void main(String[] args) {
		void salarioPretendido = 1800.0;
        void salarioPretendido = 2000.0;
        analisarCandidato(salarioPretendido);
    }
	public static void analisarCandidato(double salarioPretendido) {
			double salarioBase = 2000.0;
			if (salarioBase > salarioPretendido) {
				System.out.println("Ligar para o cadidato");
			}
			else if (salarioBase == salarioPretendido) { 
				System.out.println("Ligar para cadidato com contra proposta");
			}else{
				System.out.println("aguardando resultado dos demais cadidatos");
			}
		
    }        
}		
		
		