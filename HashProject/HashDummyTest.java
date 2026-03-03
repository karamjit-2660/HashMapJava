import java.util.HashMap;
/**
 * Escreva uma descrição da classe HashDummyTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HashDummyTest
{
    public static void main(String[] args) {
        System.out.println("Trabalhar com HashMap!!!");
        // 1. Criar uma vat do tipo HashMap
        HashMap<String, Integer> alunos = new HashMap<>();
        // 2. Adicionar valores ao HashMap
        alunos.put("Karam", 1);
        alunos.put("Rodrigo", 2);
        alunos.put("Fabio", 3);
        alunos.put("Mario", 4);
        alunos.put("Davi", 5);
        // 3. Verificar o tamanho so HashMap
        int tamanho = alunos.size();
        System.out.println("O tamanho do HM é =" + tamanho);
        // 4. Repetir a chave e ver o que é que acontece
        alunos.put("Karam", 6);
        
        int tamanho2 = alunos.size();
        System.out.println("O tamanho do HM é =" + tamanho2);
        
        
        boolean existe = alunos.containsKey("Ana");
        System.out.println("A Chave Ana Já existe: " + existe);
        
        if(existe){
            System.out.println("A chave Ana ja existe: " + existe + " Não deixo adicionar");
        }else{
            System.out.println("A chave Ana ja existe: " + existe + " Deixo adicionar");
        }
        // Apanhar o que esta guardado na chave Marcos
        Integer valorDaChaveMarcos = alunos.get("Mario");
        
        int valorDaChaveMarcos2 = alunos.get("Mario"); 
        
        System.out.println("O valor de Mario é: " + valorDaChaveMarcos2);
        // Verificar se existe um valor no HMap
        boolean existe19 = alunos.containsValue(19);
        System.out.println("19 existe: " + existe19);
        
        for(String key : alunos.keySet()) {
            System.out.println("O valor da chave é: " + key);
            
            int value = alunos.get(key);
            
            System.out.println("E o seu valor é: " + value);
        }
    }
}