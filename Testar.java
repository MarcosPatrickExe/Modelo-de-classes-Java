package Teste1;

/**
 *
 * @author Patrick
 */
public class Testar {
    public static void main(String[] args){
       Contato cont = new Contato();
             
       Telefone tel1 = new Telefone();
       tel1.setDdd("11");
       tel1.setNumero("9999-9999");
       tel1.setTipo("celular");
       
       Telefone tel2 = new Telefone();
       tel2.setDdd("11");
       tel2.setNumero("9999-9999");
       tel2.setTipo("celular");
        
       Telefone[] telefones = new Telefone[2];
       telefones[0] = tel1;
       telefones[1] = tel2;
       
       cont.setTelefones(telefones);
       
       for(Telefone t : cont.getTelefones()){
         System.out.println(t.getNumero());
       }
       
       Endereco end = new Endereco();
       end.setNumero("1830");
       end.setNomeRua("game of thrones");
       end.setComplemento("-");
       end.setEstado("SP");
       end.setCidade("-");
       end.setCep("999999");
       
       cont.setEndereco(end);
       cont.setNome("fulano");
       
       if(cont.getTelefones() != null){
         for(Telefone t : telefones){
            System.out.println(t.getDdd()+" "+t.getNumero());}
       }
    }
}