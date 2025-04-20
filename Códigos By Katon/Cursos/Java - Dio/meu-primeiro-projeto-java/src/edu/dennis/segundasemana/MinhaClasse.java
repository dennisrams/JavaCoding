public class MinhaClasse {
    
    public static void main (String [] args){
        System.out.println("\nOlá, mundo :D\n");
        String primeiroNome = "Gleyson";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    } 
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
//primeiro código demonstrativo da linguagem