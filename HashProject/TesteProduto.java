import java.util.HashMap;
/**
 * Escreva uma descrição da classe TesteProduto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteProduto
{
   public static void main(String[] args) {
       Produto p001 = new Produto("Camisola", 12.90, 5);
       Produto p002 = new Produto("Calça", 14.80, 6);
       Produto p003 = new Produto("Camisola do CR7", 122.90, 3);
       Produto p004 = new Produto("Calça do CR7", 14.80, 6);
       Produto p005 = new Produto("Purfum CR7", 122.90, 3);
       
       HashMap<String, Produto> produtos = new HashMap<>();
       
       produtos.put("P001", p001);
       produtos.put("P002", p002);
       produtos.put("P003", p003);
       produtos.put("P004", p004);
       produtos.put("P005", p005);
   }
}