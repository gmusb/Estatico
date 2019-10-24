package estatico;

public class Start {

    public static void main(String[] args) {
        Coordenador c = new Coordenador();
        c.setEscola("ETEC");
        c.setNome("Um nome ai");
        c.abrirSala();
        System.out.println(c.getEscola());
        System.out.println(c.getNome());
        
        Professor p = new Professor();
        p.setNome("Outro nome");
        p.setDisciplina("Artes");
        p.abrirSala();
        System.out.println(p.getDisciplina());
        System.out.println(p.getNome());
        
        
        Exibir.professor(p);
        Exibir.cordenador(c);
    }
    
}
