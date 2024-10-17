import java.util.Stack;

public class RemoveDuplicado {
    public static void main(String[] args) {
        Stack<Character> original = new Stack<>();
        Stack<Character> filtrado = new Stack<>();

        // Empilhar caracteres
        char[] chars = {'@', '&', '@', '#', '%', '&', '$'};
        for (char c : chars) {
            original.push(c);
        }

        // Remover duplicados
        while (!original.isEmpty()) {
            char current = original.pop();
            if (!filtrado.contains(current)) {
                filtrado.push(current);
            }
        }

        // Imprimir resultados
        while (!filtrado.isEmpty()) {
            System.out.print(filtrado.pop() + " ");
        }
    }
}
