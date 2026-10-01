package Usuario;


public class ValidarSenha {
    String senha;
    int maiuscula;
    int menuscula;
    int numero;



    //quantidade de caracteres
    int quant = senha.length();

    public boolean Validar(String senha){
       // if (senha == null) return false;

        for (int i = 0; i < senha.length(); i++){
            //maiusculo, menusculo, numero

            if (Character.isUpperCase(senha.charAt(i))){
                maiuscula+=1;
            }
            if (Character.isLowerCase(senha.charAt(i))){
                menuscula+=1;
            }
            if (Character.isDigit(senha.charAt(i))){
                numero+=1;
            }
        }
        boolean b = (numero > 0) && (maiuscula > 0) && (menuscula>0) && senha.length() >=8;
        if (b) {
            System.out.println("Senha válida");
        }


        return b;
    }





}
