public class Paciente {
    int codigo;
    float dataNascimento;
    String sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;
    public Paciente (int codigo,float dataNascimento, String sexo, String planoSaude, String alergia, String tipoSanguineo) {
        System.out.println("Adicionarocodigodopaciente");
        Paciente.codigo();
        System.out.println("AdicionardataNascimentodopaciente");
        Paciente.dataNascimento();
        System.out.println("Adicionarsexodopaciente");
        Paciente.sexo();
        System.out.println("AdicionarplanoSaudedopaciente");
        Paciente.planoSaude();
        System.out.println("Adicionaralergiadopaciente");
        Paciente.alergia();
        System.out.println("AdicionartipoSanguineodopaciente");
        Paciente.tipoSanguineo();
        
        
    }
}