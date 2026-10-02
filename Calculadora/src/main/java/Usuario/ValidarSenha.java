package Usuario;


public class ValidarSenha {

    public boolean Validar(String senha){
        boolean encontreiMaius = false;
        boolean encontreiMens = false;
        boolean encontreiNu = false;


        for (int i = 0; i < senha.length(); i++){
            //maiusculo, menusculo, numero

            if (Character.isUpperCase(senha.charAt(i))){
                encontreiMaius = true;
            }
            if (Character.isLowerCase(senha.charAt(i))){
                encontreiMens = true;
            }
            if (Character.isDigit(senha.charAt(i))){
               encontreiNu = true;
            }

        }
        boolean b = encontreiMaius && encontreiMens && encontreiNu && senha.length()>=8;
        return b;
    }





}
