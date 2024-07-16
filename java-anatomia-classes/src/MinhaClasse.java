public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Sheila";
        String segundoNome = "Roberta";

        String doisNomes = doisNomes(primeiroNome, segundoNome);

        System.out.println(doisNomes);
        
}

    public static String doisNomes (String primeiroNome, String segundoNome){
        return "Resultado da junção é " + primeiroNome.concat(" ").concat(segundoNome);
    }


}
